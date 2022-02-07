package com.metelev.bos.forwork.ui

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.metelev.bos.forwork.domain.AppState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel(), LifecycleObserver, CoroutineScope by MainScope() {

    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData()

    fun getLiveData() = liveDataToObserve

    fun getResult() = getData()

    private fun getData() {
        liveDataToObserve.value = AppState.Loading
        launch {

            liveDataToObserve.value = AppState.Success(6)
        }
    }
}