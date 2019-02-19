package com.atthapon.alphonsevalidator.error

interface ErrorMessage {
    fun getAllLowerCase(): String
    fun getAllUpperCase(): String
    fun getAtLeastOneLowerCase(): String
    fun getAtLeastOneNumberCase(): String
    fun getAtLeastOneSpecialCharacter(): String
    fun getAtLeastOneUpperCase(): String
    fun getContain(): String
    fun getCreditCard(): String
    fun getCreditCardWithDashes(): String
    fun getCreditCardWithSpaces(): String
    fun getEmail(): String
    fun getEndsWith(): String
    fun getGreaterThanOrEqual(): String
    fun getGreaterThan(): String
    fun getLessThanOrEqual(): String
    fun getLessThan(): String
    fun getMaxLength(): String
    fun getMinLength(): String
    fun getNonEmpty(): String
    fun getNoNumber(): String
    fun getNoSpecialCharacter(): String
    fun getNotContain(): String
    fun getNumberEqualTo(): String
    fun getOnlyNumbers(): String
    fun getRegex(): String
    fun getStartsWithNoNumber(): String
    fun getStartsWithNumber(): String
    fun getStartsWith(): String
    fun getTextEqualTo(): String
    fun getTextNotEqualTo(): String
    fun getValidNumber(): String
    fun getValidUrl(): String
}