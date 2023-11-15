package com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010&\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/remote/ProductService;", "", "addToCart", "Lretrofit2/Response;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/AddToCartResponse;", "request", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/AddToCartRequest;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/AddToCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCart", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ClearCartResponse;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/ClearCartRequest;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/ClearCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCart", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/DeleteFromCartResponse;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/DeleteFromCartRequest;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/DeleteFromCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetCategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductCart", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetCartProductsResponse;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductDetail", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetProductDetailResponse;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductSale", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetSaleProductResponse;", "getProductSearch", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetProductSearchResponse;", "query", "getProducts", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetProductsResponse;", "getProductsByCategory", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/GetProductsByCategoryResponse;", "category", "app_debug"})
public abstract interface ProductService {
    
    @retrofit2.http.GET(value = "get_products.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetProductsResponse>> $completion);
    
    @retrofit2.http.GET(value = "get_product_detail.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductDetail(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetProductDetailResponse>> $completion);
    
    @retrofit2.http.GET(value = "search_product.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductSearch(@retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.Nullable
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetProductSearchResponse>> $completion);
    
    @retrofit2.http.POST(value = "add_to_cart.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToCart(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.AddToCartRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.AddToCartResponse>> $completion);
    
    @retrofit2.http.GET(value = "get_cart_products.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductCart(@retrofit2.http.Query(value = "userId")
    @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetCartProductsResponse>> $completion);
    
    @retrofit2.http.POST(value = "delete_from_cart.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCart(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.DeleteFromCartRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.DeleteFromCartResponse>> $completion);
    
    @retrofit2.http.POST(value = "clear_cart.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearCart(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.ClearCartRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ClearCartResponse>> $completion);
    
    @retrofit2.http.GET(value = "get_sale_products.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductSale(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetSaleProductResponse>> $completion);
    
    @retrofit2.http.GET(value = "get_products_by_category.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductsByCategory(@retrofit2.http.Query(value = "category")
    @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetProductsByCategoryResponse>> $completion);
    
    @retrofit2.http.GET(value = "get_categories.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.GetCategoriesResponse>> $completion);
}