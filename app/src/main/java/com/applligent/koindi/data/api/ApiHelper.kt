package com.applligent.koindi.data.api

import com.applligent.koindi.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}