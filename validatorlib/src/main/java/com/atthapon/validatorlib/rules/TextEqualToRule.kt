package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class TextEqualToRule(
    val target: String,
    var errorMsg: String = "${InitValidator.errorMessage.getTextEqualTo()} $target"
): BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text == target
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}