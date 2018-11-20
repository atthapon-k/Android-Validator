package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class StartsWithRule(
    val target: String,
    var errorMsg: String = "${InitValidator.errorMessage.getStartsWith()} $target"
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