package com.senaemirmusaogullari.upschoolcapstoneproject.di

import com.google.firebase.auth.FirebaseAuth
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideProductsRepository(
        productService: ProductService,
        productDao: ProductDao
    ) = ProductRepository(productService, productDao)

    @Provides
    @Singleton
    fun provideAuthRepository(firebaseAuth: FirebaseAuth) = AuthRepository(firebaseAuth)
}