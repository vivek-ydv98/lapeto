package com.vivek.lapeto.domain.repo

import com.vivek.lapeto.common.ResultState
import com.vivek.lapeto.data.models.UserData
import kotlinx.coroutines.flow.Flow

interface Repo {

    fun loginWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun registerWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>

}