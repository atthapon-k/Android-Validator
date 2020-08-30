package com.atthapon.alphonsevalidator.rules

import android.util.Patterns

class ValidUrlRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        if(text.isEmpty()) return false
        return Patterns.WEB_URL.matcher(text).matches()
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}