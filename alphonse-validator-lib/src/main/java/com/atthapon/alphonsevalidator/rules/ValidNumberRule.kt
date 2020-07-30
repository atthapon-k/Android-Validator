package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphonseValidator

class ValidNumberRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getValidNumber()
) : BaseRule {

    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return if (text.startsWith("-")) {
            val txtNum = text.substringAfter("-")
            Validator(txtNum).regex("^[0-9]\\d*(\\.\\d+)?$").check()
        } else {
            Validator(text).regex("^[0-9]\\d*(\\.\\d+)?$").check()
        }
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}