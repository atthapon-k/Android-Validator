package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class AtLeastOneNumberCaseRule(var errorMsg: String = InitValidator.errorMessage.getAtLeastOneNumberCase()):
    BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}