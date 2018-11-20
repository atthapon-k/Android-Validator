package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class ContainsRule(
    val target: String,
    var errorMsg: String = String.format(InitValidator.errorMessage.getContain(), target)
) : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.contains(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }

}