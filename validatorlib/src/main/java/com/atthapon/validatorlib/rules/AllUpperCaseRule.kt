package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class AllUpperCaseRule(var errorMsg: String = InitValidator.errorMessage.getAllUpperCase()) : BaseRule {
    override fun validate(text: String): Boolean = text == text.toUpperCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}