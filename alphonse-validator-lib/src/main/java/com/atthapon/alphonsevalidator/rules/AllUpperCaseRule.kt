package com.atthapon.alphonsevalidator.rules

class AllUpperCaseRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean = text == text.toUpperCase()

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}