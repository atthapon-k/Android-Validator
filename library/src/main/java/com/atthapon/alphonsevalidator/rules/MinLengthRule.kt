package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class MinLengthRule(
    val minLength: Int,
    var errorMsg: String = String.format(AlphonseValidator.errorMessage.getMinLength(), minLength)
): BaseRule {

    override fun validate(text: String): Boolean {
        return text.length >= minLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}