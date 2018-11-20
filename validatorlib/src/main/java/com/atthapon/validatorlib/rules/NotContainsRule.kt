package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class NotContainsRule(
    val target: String,
    var errorMsg: String = "${InitValidator.errorMessage.getNotContain()} $target"
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