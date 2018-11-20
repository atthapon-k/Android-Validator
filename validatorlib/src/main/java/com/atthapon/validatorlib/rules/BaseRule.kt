package com.atthapon.validatorlib.rules

interface BaseRule {
    fun validate(text: String): Boolean
    fun getErrorMessage(): String
    fun setError(msg: String)
}