package com.vivek.lapeto.domain.useCases

import com.vivek.lapeto.common.ResultState
import com.vivek.lapeto.data.models.UserData
import com.vivek.lapeto.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(val repo: Repo) {

    fun loginUser(userData: UserData): Flow<ResultState<String>> {
        return repo.loginWithEmailAndPassword(userData)
    }
}