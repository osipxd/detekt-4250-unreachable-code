package com.example

import android.content.Context
import android.widget.ImageView
import coil.load

class ViewWithError(context: Context) : ImageView(context) {

    fun foo() {
        load("https://placekitten.com/200/300") {
            error(0)
            placeholder(0) // UnreachableCode here
            fallback(0)    // UnreachableCode here
        }
    }
}
