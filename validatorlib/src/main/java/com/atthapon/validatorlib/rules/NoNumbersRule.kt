package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class NoNumbersRule(var errorMsg: String = InitValidator.errorMessage.getNoNumber()): BaseRule {

    override fun validate(text: String): Boolean = !Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}