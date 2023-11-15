package com.senaemirmusaogullari.upschoolcapstoneproject.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/di/NetworkModule;", "", "()V", "provideChuckerInterceptor", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "context", "Landroid/content/Context;", "provideOkHttp", "Lokhttp3/OkHttpClient;", "chucker", "provideProductService", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/source/remote/ProductService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "okHttpClient", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.senaemirmusaogullari.upschoolcapstoneproject.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.chuckerteam.chucker.api.ChuckerInterceptor provideChuckerInterceptor(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttp(@org.jetbrains.annotations.NotNull
    com.chuckerteam.chucker.api.ChuckerInterceptor chucker) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService provideProductService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}