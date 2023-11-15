package com.senaemirmusaogullari.upschoolcapstoneproject.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\n\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\n\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001b0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\b2\u0006\u0010)\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\b2\u0006\u0010,\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/ProductRepository;", "", "productService", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/remote/ProductService;", "productDao", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/local/ProductDao;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/remote/ProductService;Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/local/ProductDao;)V", "addToCart", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/common/Resource;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/AddToCartResponse;", "request", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/AddToCartRequest;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/AddToCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToFavorites", "", "productUI", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ProductUI;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ProductUI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCart", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ClearCartResponse;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/ClearCartRequest;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/ClearCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromCart", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/DeleteFromCartRequest;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/request/DeleteFromCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromFavorites", "getCartProducts", "", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Ljava/util/Locale$Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "getProductDetail", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "getProductsByCategory", "category", "getSaleProducts", "searchProduct", "query", "app_debug"})
public final class ProductRepository {
    @org.jetbrains.annotations.NotNull
    private final com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService productService = null;
    @org.jetbrains.annotations.NotNull
    private final com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao productDao = null;
    
    public ProductRepository(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService productService, @org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProductDetail(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addToFavorites(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI productUI, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFromFavorites(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI productUI, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSaleProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchProduct(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addToCart(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.AddToCartRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.AddToCartResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFromCart(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.DeleteFromCartRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.DeleteFromCartRequest>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCartProducts(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearCart(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.model.request.ClearCartRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ClearCartResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<? extends java.util.Locale.Category>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProductsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource<? extends java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI>>> $completion) {
        return null;
    }
}