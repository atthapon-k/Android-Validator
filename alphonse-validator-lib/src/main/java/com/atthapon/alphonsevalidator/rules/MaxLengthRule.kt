package com.atthapon.alphonsevalidator.rules

class MaxLengthRule(private val maxLength: Int, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        return text.length <= maxLength
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}