package com.atthapon.alphonsevalidator.rules

/**
 * Created by Atthapon Korkaew on 2019-09-17.
 */
class NonBlankRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean = text.isNotBlank()

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}