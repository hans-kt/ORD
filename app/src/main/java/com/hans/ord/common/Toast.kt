package com.hans.ord.common

import android.content.Context
import android.widget.Toast

fun toast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}