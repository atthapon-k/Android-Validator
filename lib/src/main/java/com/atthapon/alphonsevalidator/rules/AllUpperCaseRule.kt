package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class AllUpperCaseRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getAllUpperCase()
) : BaseRule {
    override fun validate(text: String): Boolean = text == text.toUpperCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}