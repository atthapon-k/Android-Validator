package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator
import com.atthapon.alphonsevalidator.common.AlphonseValidator

class AtLeastOneSpecialCharacterRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getAtLeastOneSpecialCharacter()
) : BaseRule {
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return !Validator(text).regex("[A-Za-z0-9]+").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}