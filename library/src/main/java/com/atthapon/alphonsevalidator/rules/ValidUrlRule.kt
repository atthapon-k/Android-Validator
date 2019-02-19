package com.atthapon.alphonsevalidator.rules

import android.util.Patterns
import com.atthapon.alphonsevalidator.common.AlphonseValidator

class ValidUrlRule(var errorMsg: String = AlphonseValidator.errorMessage.getValidUrl()): BaseRule {
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Patterns.WEB_URL.matcher(text).matches()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}