package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class RegexRule(val pattern: String, var errorMsg: String = AlphonseValidator.errorMessage.getRegex()): BaseRule {

    override fun validate(text: String): Boolean {
        return text.matches(Regex(pattern))
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}