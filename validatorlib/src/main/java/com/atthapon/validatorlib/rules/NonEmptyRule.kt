package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.common.InitValidator

class NonEmptyRule(var errorMsg: String = InitValidator.errorMessage.getNonEmpty()): BaseRule {
    override fun validate(text: String): Boolean = !text.isEmpty()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}