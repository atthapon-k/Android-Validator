package com.atthapon.alphonsevalidator.rules

class TextNotEqualToRule(val target: String, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        if(text.isEmpty()) return true
        return text != target
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}