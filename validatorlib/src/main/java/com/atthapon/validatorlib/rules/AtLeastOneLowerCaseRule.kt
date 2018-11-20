package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class AtLeastOneLowerCaseRule(var errorMsg: String = InitValidator.errorMessage.getAtLeastOneLowerCase()):
    BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[a-z]).+\$").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}