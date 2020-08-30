package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator

class AtLeastOneLowerCaseRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[a-z]).+\$").check()

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}