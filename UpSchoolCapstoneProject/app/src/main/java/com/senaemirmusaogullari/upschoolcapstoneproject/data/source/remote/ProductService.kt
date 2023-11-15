package com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote

import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.AddToCartRequest
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.ClearCartRequest
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.DeleteFromCartRequest
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.BaseResponse
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetProductDetailResponse
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetProductsResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ProductService {

    @GET("get_products.php")
    suspend fun getProducts(): Response<GetProductsResponse>

    @GET("get_product_detail.php")
    suspend fun getProductDetail(
        @Query("id") id: Int
    ): Response<GetProductDetailResponse>

    @GET("search_product.php")
    suspend fun getProductSearch(
        @Query("query") query: String?
    ): Response<GetProductsResponse>

    @POST("add_to_cart.php")
    suspend fun addToCart(
        @Body request: AddToCartRequest
    ): Response<GetProductsResponse>

    @GET("get_cart_products.php")
    suspend fun getProductCart(
        @Query("userId") userId: String?
    ): Response<GetProductsResponse>

    @POST("delete_from_cart.php")
    suspend fun deleteCart(
        @Body request: DeleteFromCartRequest
    ): Response<BaseResponse>

    @POST("clear_cart.php")
    suspend fun clearCart(
        @Body request: ClearCartRequest
    ): Response<BaseResponse>

    @GET("get_sale_products.php")
    suspend fun getProductSale(): Response<GetProductsResponse>

    @GET("get_products_by_category.php")
    suspend fun getProductsByCategory(
        @Query("category") category: String
    ): Response<GetProductsResponse>
}


