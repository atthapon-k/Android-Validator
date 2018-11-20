package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class RegexRule(val pattern: String, var errorMsg: String = InitValidator.errorMessage.getRegex()): BaseRule {

    override fun validate(text: String): Boolean {
        return text.matches(Regex(pattern))
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}