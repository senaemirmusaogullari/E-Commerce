package com.senaemirmusaogullari.upschoolcapstoneproject.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/di/RepositoryModule;", "", "()V", "provideAuthRepository", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/AuthRepository;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideProductsRepository", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/ProductRepository;", "productService", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/remote/ProductService;", "productDao", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/local/ProductDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.senaemirmusaogullari.upschoolcapstoneproject.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository provideProductsRepository(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService productService, @org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao productDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        return null;
    }
}