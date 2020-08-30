package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator

class OnlyNumbersRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex("\\d+").check()

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}