package com.atthapon.validatorlib.rules

import android.util.Patterns
import com.atthapon.validatorlib.common.InitValidator

class ValidUrlRule(var errorMsg: String = InitValidator.errorMessage.getValidUrl()): BaseRule {
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