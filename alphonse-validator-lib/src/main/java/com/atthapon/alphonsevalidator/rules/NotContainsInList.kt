package com.atthapon.alphonsevalidator.rules

class NotContainsInList(val target: List<Any>, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        return !target.contains(text)
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}