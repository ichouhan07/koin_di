package com.applligent.koindi.data.repository

import com.applligent.koindi.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}