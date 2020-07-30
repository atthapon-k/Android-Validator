package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class EndsWithRule(
    val target: String,
    var errorMsg: String = String.format(AlphonseValidator.getErrorMessage().getEndsWith(), target)
) : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.endsWith(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}