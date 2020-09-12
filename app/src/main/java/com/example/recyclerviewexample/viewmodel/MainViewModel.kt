package com.example.recyclerviewexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewexample.Usuario
import com.example.recyclerviewexample.domain.data.network.Repo

class MainViewModel: ViewModel() {
    private val repo = Repo()
    fun fetchUserData(): LiveData<MutableList<Usuario>> {
        val mutableData = MutableLiveData<MutableList<Usuario>>()

        repo.getUserData().observeForever{
            userList -> mutableData.value = userList
        }

        return mutableData
    }
}