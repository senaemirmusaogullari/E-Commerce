package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.senaemirmusaogullari.upschoolcapstoneproject.R
import com.senaemirmusaogullari.upschoolcapstoneproject.common.gone
import com.senaemirmusaogullari.upschoolcapstoneproject.common.viewBinding
import com.senaemirmusaogullari.upschoolcapstoneproject.common.visible
import com.senaemirmusaogullari.upschoolcapstoneproject.databinding.FragmentSignupBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_signup) {

    private val binding by viewBinding(FragmentSignupBinding::bind)

    private val viewModel: SignUpViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeData()

        with(binding) {

            btnSignUp.setOnClickListener {
                viewModel.signUp(
                    etNickname.text.toString(),
                    etEmail.text.toString(),
                    etPhone.text.toString(),
                    etPassword.text.toString(),
                    etVerifyPassword.text.toString()
                )
            }
            textView.setOnClickListener {
                findNavController().navigate(SignUpFragmentDirections.signupToSignin())
            }
        }
    }

    private fun observeData() = with(binding) {
        viewModel.signUpState.observe(viewLifecycleOwner) { state ->
            when (state) {
                SignUpState.Loading -> progressBar.visible()

                is SignUpState.GoToHome -> {
                    progressBar.gone()
                    findNavController().navigate(SignUpFragmentDirections.signupToMain())
                }

                is SignUpState.ShowPopUp -> {
                    progressBar.gone()
                    Snackbar.make(requireView(), state.errorMessage, 1000).show()
                }
            }
        }
    }
}
