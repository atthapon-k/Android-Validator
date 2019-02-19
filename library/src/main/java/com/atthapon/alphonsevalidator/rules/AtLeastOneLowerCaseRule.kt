package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class AtLeastOneLowerCaseRule(var errorMsg: String = AlphoneseValidator.errorMessage.getAtLeastOneLowerCase()):
    BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[a-z]).+\$").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}