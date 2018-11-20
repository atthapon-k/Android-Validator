package com.atthapon.validatorlib.common

import android.annotation.SuppressLint
import android.content.Context
import com.atthapon.validatorlib.error.DefaultErrorMessage
import com.atthapon.validatorlib.error.ErrorMessage

@SuppressLint("StaticFieldLeak")
object InitValidator {
    lateinit var errorMessage: ErrorMessage
    lateinit var context: Context

    private fun init(context: Context, errorMessage: ErrorMessage = DefaultErrorMessage()) {
        this.context = context
        this.errorMessage = errorMessage
    }

    class Builder {
        private lateinit var context: Context
        private lateinit var errorMessage: ErrorMessage

        fun setContext(context: Context): Builder {
            this.context = context
            return this
        }

        fun setErrorMessage(errorMessage: ErrorMessage): Builder {
            this.errorMessage = errorMessage
            return this
        }

        fun build() {
            init(context, errorMessage)
        }
    }
}