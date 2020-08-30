package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator

class StartsWithNoNumberRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        if(text.isEmpty()) return false
        return !Validator(text).regex("^(\\d+.*|-\\d+.*)").check()
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}