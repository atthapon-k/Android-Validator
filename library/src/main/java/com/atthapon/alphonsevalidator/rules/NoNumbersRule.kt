package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class NoNumbersRule(var errorMsg: String = AlphoneseValidator.errorMessage.getNoNumber()): BaseRule {

    override fun validate(text: String): Boolean = !Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}