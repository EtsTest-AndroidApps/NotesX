package com.vaibhav.notesappcompose.data.repo

import com.vaibhav.notesappcompose.data.models.entity.User
import com.vaibhav.notesappcompose.data.models.remote.requests.RegisterBody
import com.vaibhav.notesappcompose.util.Resource

interface AuthRepo {

    suspend fun loginUser(email: String, password: String): Resource<User>

    suspend fun registerUser(registerBody: RegisterBody): Resource<User>


}