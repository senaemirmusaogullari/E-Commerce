package com.senaemirmusaogullari.upschoolcapstoneproject.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.senaemirmusaogullari.upschoolcapstoneproject.common.Constants.BASE_URL
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideChuckerInterceptor(@ApplicationContext context: Context) = ChuckerInterceptor.Builder(context).build()

    @Singleton
    @Provides
    fun provideOkHttp(chucker: ChuckerInterceptor) = OkHttpClient.Builder().apply {
        addInterceptor(
            Interceptor { chain ->
                val builder = chain.request().newBuilder()
                builder.header("store", "Manny's")
                return@Interceptor chain.proceed(builder.build())
            }
        )
        addInterceptor(chucker)
    }.build()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder().apply {
        addConverterFactory(GsonConverterFactory.create())
        baseUrl(BASE_URL)
        client(okHttpClient)
    }.build()

    @Singleton
    @Provides
    fun provideProductService(retrofit: Retrofit): ProductService = retrofit.create(ProductService::class.java)
}