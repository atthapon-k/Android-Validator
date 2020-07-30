package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class RegexRule(
    private val pattern: String, var errorMsg: String = AlphonseValidator.getErrorMessage()
        .getRegex()
) : BaseRule {

    override fun validate(text: String): Boolean {
        return text.matches(Regex(pattern))
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}