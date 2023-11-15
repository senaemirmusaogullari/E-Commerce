package com.senaemirmusaogullari.upschoolcapstoneproject.ui.payment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.senaemirmusaogullari.upschoolcapstoneproject.R
import com.senaemirmusaogullari.upschoolcapstoneproject.common.viewBinding
import com.senaemirmusaogullari.upschoolcapstoneproject.databinding.FragmentSuccessBinding
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.payment.SuccessFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PaymentSuccessFragment : Fragment(R.layout.fragment_success) {

    private val binding by viewBinding(FragmentSuccessBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnGoHome.setOnClickListener {
                findNavController().navigate(SuccessFragmentDirections.successToHome())
            }
        }
    }
}