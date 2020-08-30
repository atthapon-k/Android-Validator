package com.atthapon.alphonsevalidator.rules

class AllLowerCaseRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean = text == text.toLowerCase()

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}