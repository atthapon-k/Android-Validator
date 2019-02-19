package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class AtLeastOneNumberCaseRule(var errorMsg: String = AlphoneseValidator.errorMessage.getAtLeastOneNumberCase()):
    BaseRule {
    override fun validate(text: String): Boolean = Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}