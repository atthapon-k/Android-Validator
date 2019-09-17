package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator

/**
 * Created by Atthapon Korkaew on 2019-09-17.
 */
class NonBlankRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getNonBlank()
) : BaseRule {
    override fun validate(text: String): Boolean = !text.isNotBlank()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}