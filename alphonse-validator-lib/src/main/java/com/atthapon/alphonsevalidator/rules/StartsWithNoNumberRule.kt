package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphonseValidator

class StartsWithNoNumberRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getStartsWithNoNumber()
) : BaseRule {
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return !Validator(text).regex("^(\\d+.*|-\\d+.*)").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}