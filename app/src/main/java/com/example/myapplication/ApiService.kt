package com.example.rx_livedata_retrofit

import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}