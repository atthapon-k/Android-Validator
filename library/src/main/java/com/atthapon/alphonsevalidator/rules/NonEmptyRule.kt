package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

class NonEmptyRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getNonEmpty()
) : BaseRule {
    override fun validate(text: String): Boolean = !text.isEmpty()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}