package com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.senaemirmusaogullari.upschoolcapstoneproject.R
import com.senaemirmusaogullari.upschoolcapstoneproject.common.gone
import com.senaemirmusaogullari.upschoolcapstoneproject.common.viewBinding
import com.senaemirmusaogullari.upschoolcapstoneproject.common.visible
import com.senaemirmusaogullari.upschoolcapstoneproject.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val binding by viewBinding(FragmentDetailBinding::bind)

    private val viewModel by viewModels<DetailViewModel>()

    private val args by navArgs<DetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getProductDetail(args.id)

        observeData()

        with(binding) {
            btnAddToCart.setOnClickListener {
                viewModel.addToCart(args.id)
            }

            ivFavorite.setOnClickListener {
                viewModel.setFavorites(args.id)
            }
        }
    }

    private fun observeData() = with(binding) {
        viewModel.detailState.observe(viewLifecycleOwner) { state ->
            when (state) {
                DetailState.Loading -> progressBar.visible()

                is DetailState.SuccessState -> {
                    progressBar.gone()
                    Glide.with(ivProduct).load(state.product.imageOne).into(ivProduct)
                    tvTitle.text = state.product.title
                    tvPrice.text = "${state.product.price} ₺"
                    tvDescription.text = state.product.description
                    ratingBar.rating = state.product.rate.toFloat()

                    ivFavorite.setBackgroundResource(
                        if (state.product.isFavorite) R.drawable.ic_fav_selected
                        else R.drawable.ic_fav_unselected
                    )

                    ivBack.setOnClickListener {
                        findNavController().navigateUp()
                    }
                }

                is DetailState.EmptyScreen -> {
                    progressBar.gone()
                    ivError.visible()
                    tvError.visible()
                    tvError.text = state.failMessage
                }

                is DetailState.ShowPopUp -> {
                    progressBar.gone()
                    Snackbar.make(requireView(), state.errorMessage, 1000).show()
                }
            }
        }
    }
}



