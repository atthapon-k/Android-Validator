package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class MinLengthRule(
    private val minLength: Int,
    var errorMsg: String = String.format(AlphonseValidator.getErrorMessage().getMinLength(), minLength)
) : BaseRule {

    override fun validate(text: String): Boolean {
        return text.length >= minLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}