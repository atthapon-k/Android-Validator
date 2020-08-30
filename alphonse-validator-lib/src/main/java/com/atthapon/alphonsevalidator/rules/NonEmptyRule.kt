package com.atthapon.alphonsevalidator.rules

class NonEmptyRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean = text.isNotEmpty()

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}