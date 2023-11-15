package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private var _signUpState = MutableLiveData<SignUpState>()
    val signUpState: LiveData<SignUpState> get() = _signUpState

    fun signUp(
        nickname: String,
        email: String,
        phone: String,
        password: String,
        verifyPassword: String
    ) = viewModelScope.launch {
        if (checkFields(nickname, email, phone, password, verifyPassword)) {
            _signUpState.value = SignUpState.Loading

            _signUpState.value = when (val result =
                authRepository.signUp(nickname, email, phone, password, verifyPassword)) {
                is Resource.Success -> SignUpState.GoToHome
                is Resource.Fail -> SignUpState.ShowPopUp(result.failMessage)
                is Resource.Error -> SignUpState.ShowPopUp(result.errorMessage)
            }
        }
    }

    private fun checkFields(
        nickname: String,
        email: String,
        phone: String,
        password: String,
        verifyPassword: String
    ): Boolean {
        return when {
            email.isEmpty() -> {
                _signUpState.value = SignUpState.ShowPopUp("Email Alanı Boş Bırakılamaz!")
                false
            }

            password.isEmpty() -> {
                _signUpState.value = SignUpState.ShowPopUp("Şifre Alanı Boş Bırakılamaz!")
                false
            }

            password.length < 6 -> {
                _signUpState.value = SignUpState.ShowPopUp("Şİfre 6 Karakterden Kısa Olamaz!")
                false
            }

            else -> true
        }
    }
}

sealed interface SignUpState {
    object Loading : SignUpState
    object GoToHome : SignUpState
    data class ShowPopUp(val errorMessage: String) : SignUpState
}