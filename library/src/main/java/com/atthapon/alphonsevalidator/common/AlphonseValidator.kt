package com.atthapon.alphonsevalidator.common

import com.atthapon.alphonsevalidator.error.DefaultErrorMessage
import com.atthapon.alphonsevalidator.error.ErrorMessage

object AlphonseValidator {
    var errorMessage: ErrorMessage = DefaultErrorMessage()

    private fun init(errorMessage: ErrorMessage) {
        this.errorMessage = errorMessage
    }

    class Builder {
        private lateinit var errorMessage: ErrorMessage

        fun setErrorMessage(errorMessage: ErrorMessage): Builder {
            this.errorMessage = errorMessage
            return this
        }

        fun build() {
            init(errorMessage)
        }
    }
}