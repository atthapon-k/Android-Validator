package com.atthapon.alphonsevalidator.common

import com.atthapon.alphonsevalidator.error.DefaultErrorMessage
import com.atthapon.alphonsevalidator.error.ErrorMessage

object AlphonseValidator {
    private var customErrorMessage: ErrorMessage? = null
    private val defaultErrorMessage = DefaultErrorMessage()

    private fun init(errorMessage: ErrorMessage) {
        this.customErrorMessage = errorMessage
    }

    fun getErrorMessage(): ErrorMessage {
        return customErrorMessage ?: defaultErrorMessage
    }

    class Builder {
        private lateinit var errorMessage: ErrorMessage

        fun setCustomErrorMessage(errorMessage: ErrorMessage): Builder {
            this.errorMessage = errorMessage
            return this
        }

        fun build() {
            init(errorMessage)
        }
    }
}