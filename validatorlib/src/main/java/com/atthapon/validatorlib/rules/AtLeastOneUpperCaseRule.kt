package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class AtLeastOneUpperCaseRule(var errorMsg: String = InitValidator.errorMessage.getAtLeastOneUpperCase()):
    BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[A-Z]).+\$").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}