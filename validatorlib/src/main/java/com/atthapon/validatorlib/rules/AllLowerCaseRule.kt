package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class AllLowerCaseRule(var errorMsg: String = InitValidator.errorMessage.getAllLowerCase()) : BaseRule {
    override fun validate(text: String): Boolean = text == text.toLowerCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}