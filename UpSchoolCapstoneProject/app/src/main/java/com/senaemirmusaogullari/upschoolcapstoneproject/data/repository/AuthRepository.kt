package com.senaemirmusaogullari.upschoolcapstoneproject.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.senaemirmusaogullari.upschoolcapstoneproject.common.Resource
import kotlinx.coroutines.tasks.await

class AuthRepository(private val firebaseAuth: FirebaseAuth) {

    fun isUserLoggedIn() = firebaseAuth.currentUser != null

    fun getUserId() = firebaseAuth.currentUser?.uid.orEmpty()

    suspend fun signIn(email: String, password: String): Resource<Unit> {

        return try {

            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()

            if (result.user != null) {
                Resource.Success(Unit)
            } else {
                Resource.Error("Ups! Bir hata oluştu!")
            }
        } catch (e: Exception) {
            Resource.Error("Kullanıcı Bulunamadı!")
        }
    }

    suspend fun signUp(
        nickname: String,
        email: String,
        phone: String,
        password: String,
        verifyPassword: String
    ): Resource<Unit> {

        return try {

            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()

            if (result.user != null) {
                Resource.Success(Unit)
            } else {
                Resource.Error("Ups! Bir hata oluştu!")
            }
        } catch (e: Exception) {
            Resource.Error("Ups! Bir hata oluştu!")
        }
    }

    fun logOut() = firebaseAuth.signOut()
}