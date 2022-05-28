package com.example.rx_livedata_retrofit

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}