package com.atthapon.alphonsevalidator.rules

class StartsWithRule(val target: String, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        if(text.isEmpty()) return false
        return text.startsWith(target)
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}