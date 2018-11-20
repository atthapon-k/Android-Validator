package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class MaxLengthRule(
    val maxLength: Int,
    var errorMsg: String = String.format(InitValidator.errorMessage.getMaxLength(), maxLength)
): BaseRule {

    override fun validate(text: String): Boolean {
        return text.length <= maxLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}