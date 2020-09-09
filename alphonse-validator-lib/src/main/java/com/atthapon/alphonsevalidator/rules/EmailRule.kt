package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.Validator

class EmailRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        return Validator(text).regex(
            "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-+]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z‌​]{2,})$"
        ).check()
    }


    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}