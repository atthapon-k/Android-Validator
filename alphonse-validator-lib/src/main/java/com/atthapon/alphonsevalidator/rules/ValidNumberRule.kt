package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator
import java.text.NumberFormat

class ValidNumberRule(
    var errorMsg: String = AlphonseValidator.getErrorMessage().getValidNumber()
) : BaseRule {

    override fun validate(text: String): Boolean {
        return try {
            NumberFormat.getNumberInstance().parse(text) != null
        } catch (ex: Exception) {
            false
        }
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}