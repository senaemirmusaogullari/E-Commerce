package com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    private var _detailState = MutableLiveData<DetailState>()
    val detailState: LiveData<DetailState> get() = _detailState

    private var detailData: ProductUI? = null

    fun getProductDetail(id: Int) = viewModelScope.launch {
        _detailState.value = DetailState.Loading

        _detailState.value = when (val result = productRepository.getProductDetail(id)) {
            is Resource.Success -> DetailState.SuccessState(result.data)
            is Resource.Fail -> DetailState.EmptyScreen(result.failMessage)
            is Resource.Error -> DetailState.ShowPopUp(result.errorMessage)
        }

    }

    fun addToCart(id: Int) = viewModelScope.launch {
        productRepository.addToCart(authRepository.getUserId(), id)
    }

    fun setFavorites(id: Int) {
        viewModelScope.launch {
            detailData?.let {
                if (it.isFavorite) {
                    productRepository.deleteFromFavorites(it)
                } else {
                    productRepository.addToFavorites(it)
                }
                getProductDetail(id)
            }
        }
    }
}

sealed interface DetailState {
    object Loading : DetailState
    data class SuccessState(val product: ProductUI) : DetailState
    data class EmptyScreen(val failMessage: String) : DetailState
    data class ShowPopUp(val errorMessage: String) : DetailState
}
