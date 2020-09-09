package com.atthapon.alphonsevalidator

fun String.validator(): Validator {
    return Validator(this)
}

fun String.validNumber(errorMsg: String? = null): Boolean {
    return validator().validNumber(errorMsg).check()
}

fun String.contains(target: String, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg).check()
}

fun String.contains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg)
        .addErrorCallback { callback.invoke(it) }.check()
}

fun String.contains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().contains(target)
        .addErrorCallback { callback.invoke(it) }.check()
}

fun String.regex(pattern: String, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg).check()
}

fun String.regex(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg)
        .addErrorCallback { callback.invoke(it) }.check()
}

fun String.regex(pattern: String, callback: (message: String) -> Unit): Boolean {
    return validator().regex(pattern)
        .addErrorCallback { callback.invoke(it) }.check()
}