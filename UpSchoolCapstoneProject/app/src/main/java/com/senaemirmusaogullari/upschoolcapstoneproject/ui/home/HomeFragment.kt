package com.senaemirmusaogullari.upschoolcapstoneproject.ui.home

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
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI
import com.senaemirmusaogullari.upschoolcapstoneproject.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val viewModel by viewModels<HomeViewModel>()

    private val productAdapter =
        ProductsAdapter(onProductClick = ::onProductClick, onFavClick = ::onFavClick)

    private val saleProductAdapter =
        SaleProductAdapter(onProductClick = ::onProductClick, onFavClick = ::onFavClick)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getProducts()
        viewModel.getSaleProducts()

        with(binding) {
            rvProducts.adapter = productAdapter
            rvSaleProducts.adapter = saleProductAdapter

            ivLogout.setOnClickListener {
                viewModel.logOut()
            }
        }

        observeData()
    }

    private fun observeData() = with(binding) {
        viewModel.homeState.observe(viewLifecycleOwner) { state ->
            when (state) {
                HomeState.Loading -> {
                    progressBar.visible()
                }

                is HomeState.SuccessState -> {
                    progressBar.gone()
                    productAdapter.submitList(state.products)
                }

                is HomeState.SuccessSaleState -> {
                    progressBar.gone()
                    saleProductAdapter.submitList(state.products)
                }

                is HomeState.EmptyScreen -> {
                    progressBar.gone()
                    tvError.text = state.failMessage
                    ivError.visible()
                    tvError.visible()

                }

                is HomeState.ShowPopUp -> {
                    progressBar.gone()
                    Snackbar.make(requireView(), state.errorMessage, 1000).show()
                }

                HomeState.GoToSignIn -> {
                    findNavController().navigate(R.id.homeToMain)
                }
            }
        }

        viewModel.saleState.observe(viewLifecycleOwner) { state ->
            when(state) {
                SaleState.Loading -> progressBar.visible()

                is SaleState.SuccessState -> {
                    progressBar.gone()
                    saleProductAdapter.submitList(state.products)
                }

                is SaleState.EmptyScreen -> {
                    progressBar.gone()
                    rvSaleProducts.gone()
                    tvError.text = state.failMessage
                    tvError.visible()
                    ivError.visible()
                }

                is SaleState.ShowPopUp -> {
                    progressBar.gone()
                    Snackbar.make(requireView(), state.errorMessage, 1000).show()
                }

                else -> {}
            }
        }
    }

    private fun onProductClick(id: Int) {
        findNavController().navigate(HomeFragmentDirections.homeToDetail(id))
    }

    private fun onFavClick(product: ProductUI) {
        viewModel.setFavoriteState(product)
    }
}