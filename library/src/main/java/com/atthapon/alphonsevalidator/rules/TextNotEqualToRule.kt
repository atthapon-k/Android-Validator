package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class TextNotEqualToRule(
    val target: String,
    var errorMsg: String = String.format(AlphoneseValidator.errorMessage.getTextNotEqualTo(), target)
): BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return true

        return text != target
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}