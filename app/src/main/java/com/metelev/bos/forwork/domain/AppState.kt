package com.metelev.bos.forwork.domain

import android.view.animation.Animation

sealed class AppState {
    data class Success(val data: Int) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
