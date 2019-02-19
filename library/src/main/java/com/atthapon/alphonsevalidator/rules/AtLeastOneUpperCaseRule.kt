package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class AtLeastOneUpperCaseRule(var errorMsg: String = AlphoneseValidator.errorMessage.getAtLeastOneUpperCase()):
    BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[A-Z]).+\$").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}