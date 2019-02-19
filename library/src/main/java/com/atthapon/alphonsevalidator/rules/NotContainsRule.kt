package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class NotContainsRule(
    val target: String,
    var errorMsg: String = String.format(AlphoneseValidator.errorMessage.getNotContain(), target)
): BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return !text.contains(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}