package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class StartsWithRule(
    val target: String,
    var errorMsg: String = String.format(AlphoneseValidator.errorMessage.getStartsWith(), target)
): BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.startsWith(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}