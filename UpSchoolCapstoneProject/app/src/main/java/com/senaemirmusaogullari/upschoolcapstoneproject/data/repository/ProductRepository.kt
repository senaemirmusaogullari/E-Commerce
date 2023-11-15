package com.senaemirmusaogullari.upschoolcapstoneproject.data.repository

import com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource
import com.senaemirmusaogullari.upschoolcapstoneproject.data.mapper.mapProductEntityToProductUI
import com.senaemirmusaogullari.upschoolcapstoneproject.data.mapper.mapProductToProductUI
import com.senaemirmusaogullari.upschoolcapstoneproject.data.mapper.mapToProductEntity
import com.senaemirmusaogullari.upschoolcapstoneproject.data.mapper.mapToProductUI
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.AddToCartRequest
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.ClearCartRequest
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.DeleteFromCartRequest
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.BaseResponse
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository(

    private val productService: ProductService,
    private val productDao: ProductDao
) {
        suspend fun getProducts(): Resource<List<ProductUI>> =
            withContext(Dispatchers.IO) {
                try {
                    val favorites = productDao.getProductIds()
                    val response = productService.getProducts().body()

                    if (response?.status == 200) {
                        Resource.Success(response.products.orEmpty().mapProductToProductUI(favorites))
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun getSaleProducts() : Resource<List<ProductUI>> =
            withContext(Dispatchers.IO) {
                try {
                    val favorites = productDao.getProductIds()
                    val response = productService.getProductSale().body()

                    if (response?.status == 200) {
                        Resource.Success(response.products.orEmpty().mapProductToProductUI(favorites))
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                }  catch (e: Exception) {
                    Resource.Error("Something went wrong")
                }
            }

        suspend fun getProductsByCategory(category: String): Resource<List<ProductUI>> =
            withContext(Dispatchers.IO) {
                try {
                    val favorites = productDao.getProductIds()
                    val response = productService.getProductsByCategory(category).body()

                    if (response?.status == 200) {
                        Resource.Success(response.products.orEmpty().mapProductToProductUI(favorites))
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun getProductDetail(id: Int): Resource<ProductUI> =
            withContext(Dispatchers.IO) {
                try {
                    val favorites = productDao.getProductIds()
                    val response = productService.getProductDetail(id).body()

                    if (response?.status == 200 && response.product != null) {
                        Resource.Success(response.product.mapToProductUI(favorites))
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun searchProduct(query : String): Resource<List<ProductUI>> =
            withContext(Dispatchers.IO) {
                try {
                    val response = productService.getProductSearch(query).body()
                    val favorites = productDao.getProductIds()

                    if (response?.status == 200) {
                        Resource.Success(response.products.orEmpty().mapProductToProductUI(favorites))
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun addToCart(userId: String, productId: Int): Resource<BaseResponse> =
            withContext(Dispatchers.IO) {
                try {
                    val response = productService.addToCart(AddToCartRequest(userId, productId)).body()

                    if (response?.status == 200) {
                        Resource.Success(response)
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun deleteFromCart(userId: String, productId: Int): Resource<BaseResponse> =
            withContext(Dispatchers.IO) {
                try {
                    val response = productService.deleteCart(DeleteFromCartRequest(userId, productId)).body()

                    if (response?.status == 200) {
                        Resource.Success(response)
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun getCartProducts(userId: String) : Resource<List<ProductUI>> =
            withContext(Dispatchers.IO) {
                try {
                    val response = productService.getProductCart(userId).body()
                    val favorites = productDao.getProductIds()

                    if (response?.status == 200) {
                        Resource.Success(response.products.orEmpty().mapProductToProductUI(favorites))
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun clearCart(userId: String) : Resource<BaseResponse> =
            withContext(Dispatchers.IO) {
                try {
                    val response = productService.clearCart(ClearCartRequest(userId)).body()
                    if (response?.status == 200) {
                        Resource.Success(response)
                    } else {
                        Resource.Fail(response?.message.orEmpty())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun getFavorites(): Resource<List<ProductUI>> =
            withContext(Dispatchers.IO) {
                try {
                    val products = productDao.getProducts()

                    if (products.isEmpty()) {
                        Resource.Fail("Products not found")
                    } else {
                        Resource.Success(products.mapProductEntityToProductUI())
                    }
                } catch (e: Exception) {
                    Resource.Error(e.message.orEmpty())
                }
            }

        suspend fun addToFavorites(productUI: ProductUI) {
            productDao.addProduct(productUI.mapToProductEntity())
        }

        suspend fun deleteFromFavorites(productUI: ProductUI) {
            productDao.deleteProduct(productUI.mapToProductEntity())
        }

        suspend fun clearFavorites() {
            productDao.clearFavorites()
        }
    }