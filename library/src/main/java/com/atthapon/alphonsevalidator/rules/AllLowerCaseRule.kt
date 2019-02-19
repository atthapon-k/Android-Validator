package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class AllLowerCaseRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getAllLowerCase()
) : BaseRule {
    override fun validate(text: String): Boolean = text == text.toLowerCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}