package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class NoSpecialCharacterRule(var errorMsg: String = AlphoneseValidator.errorMessage.getNoSpecialCharacter()):
    BaseRule {
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Validator(text).regex("[A-Za-z0-9]+").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}