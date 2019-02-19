package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class MaxLengthRule(
    val maxLength: Int,
    var errorMsg: String = String.format(AlphoneseValidator.errorMessage.getMaxLength(), maxLength)
): BaseRule {

    override fun validate(text: String): Boolean {
        return text.length <= maxLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}