package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class TextNotEqualToRule(
    val target: String,
    var errorMsg: String = String.format(InitValidator.errorMessage.getTextNotEqualTo(), target)
): BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return true

        return text != target
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}