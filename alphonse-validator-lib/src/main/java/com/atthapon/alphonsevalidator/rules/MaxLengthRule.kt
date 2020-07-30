package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class MaxLengthRule(
    private val maxLength: Int,
    var errorMsg: String = String.format(AlphonseValidator.getErrorMessage()
        .getMaxLength(), maxLength)
) : BaseRule {

    override fun validate(text: String): Boolean {
        return text.length <= maxLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}