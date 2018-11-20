package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class OnlyNumbersRule(var errorMsg: String = InitValidator.errorMessage.getOnlyNumbers()): BaseRule {

    override fun validate(text: String): Boolean = Validator(text).regex("\\d+").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}