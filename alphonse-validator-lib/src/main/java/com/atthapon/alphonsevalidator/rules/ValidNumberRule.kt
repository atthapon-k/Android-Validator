package com.atthapon.alphonsevalidator.rules

import java.text.NumberFormat

class ValidNumberRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        return try {
            NumberFormat.getNumberInstance().parse(text) != null
        } catch(ex: Exception) {
            false
        }
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}