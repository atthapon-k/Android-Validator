package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class MinLengthRule(
    val minLength: Int,
    var errorMsg: String = String.format(AlphoneseValidator.errorMessage.getMinLength(), minLength)
): BaseRule {

    override fun validate(text: String): Boolean {
        return text.length >= minLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}