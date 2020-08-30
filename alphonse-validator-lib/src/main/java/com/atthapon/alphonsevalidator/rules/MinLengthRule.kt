package com.atthapon.alphonsevalidator.rules

class MinLengthRule(private val minLength: Int, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        return text.length >= minLength
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}