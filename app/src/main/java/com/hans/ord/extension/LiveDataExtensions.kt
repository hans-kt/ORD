package com.hans.ord.extension

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.observe(lifecycleOwner: LifecycleOwner, observe: (T) -> Unit) {
    this.observe(lifecycleOwner, Observer {
        observe.invoke(it)
    })
}