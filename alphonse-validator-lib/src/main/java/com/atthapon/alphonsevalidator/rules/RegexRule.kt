package com.atthapon.alphonsevalidator.rules

class RegexRule(private val pattern: String, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        return text.matches(Regex(pattern))
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}