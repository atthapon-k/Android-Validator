package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class AllLowerCaseRule(var errorMsg: String = AlphoneseValidator.errorMessage.getAllLowerCase()) : BaseRule {
    override fun validate(text: String): Boolean = text == text.toLowerCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}