package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class MinLengthRule(
    val minLength: Int,
    var errorMsg: String = String.format(InitValidator.errorMessage.getMinLength(), minLength)
): BaseRule {

    override fun validate(text: String): Boolean {
        return text.length >= minLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}