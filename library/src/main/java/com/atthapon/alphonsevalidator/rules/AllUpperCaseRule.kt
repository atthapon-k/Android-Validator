package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class AllUpperCaseRule(var errorMsg: String = AlphoneseValidator.errorMessage.getAllUpperCase()) : BaseRule {
    override fun validate(text: String): Boolean = text == text.toUpperCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}