package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class StartsWithNumberRule(var errorMsg: String = InitValidator.errorMessage.getStartsWithNumber()): BaseRule {
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Validator(text).regex("^(\\d+.*|-\\d+.*)").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}