package com.hans.ord.extension

import android.view.View

fun View.visibleOrInvisible(b: Boolean) {
    if(b) visible()
    else invisible()
}

fun View.visibleOrGone(b: Boolean){
    if(b) visible()
    else gone()
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}