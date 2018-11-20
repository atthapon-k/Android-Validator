package com.atthapon.validatorlib.error

open class DefaultErrorMessage: ErrorMessage {
    override fun getAllLowerCase(): String = "All letters should be in lower case."

    override fun getAllUpperCase(): String = "All letters should be in upper case."

    override fun getAtLeastOneLowerCase(): String = "At least one letter should be in lower case."

    override fun getAtLeastOneNumberCase(): String = "At least one letter should be a number."

    override fun getAtLeastOneSpecialCharacter(): String = "Should contain at least 1 special characters."

    override fun getAtLeastOneUpperCase(): String = "At least one letter should be in upper case."

    override fun getContain(): String = "Should contain"

    override fun getCreditCard(): String = "Invalid Credit Card Number!"

    override fun getCreditCardWithDashes(): String = "Invalid Credit Card Number!"

    override fun getCreditCardWithSpaces(): String = "Invalid Credit Card Number!"

    override fun getEmail(): String = "Invalid Email Address!"

    override fun getEndsWith(): String = "Should end with"

    override fun getGreaterThanOrEqual(): String = "Should be greater than or equal to"

    override fun getGreaterThan(): String = "Should be greater than"

    override fun getLessThanOrEqual(): String = "Should be less than or equal to"

    override fun getLessThan(): String = "Should be less than"

    override fun getMaxLength(): String = "Length should be less than or equal to"

    override fun getMinLength(): String = "Length should be greater than"

    override fun getNonEmpty(): String = "Can't be empty!"

    override fun getNoNumber(): String = "Should not contain any numbers!"

    override fun getNoSpecialCharacter(): String = "Should not contain any special characters"

    override fun getNotContain(): String = "Should not contain"

    override fun getNumberEqualTo(): String = "Should be equal to"

    override fun getOnlyNumbers(): String = "Should not contain any alphabet characters!"

    override fun getRegex(): String = "Regex pattern doesn't match!"

    override fun getStartsWithNoNumber(): String = "Should not start with any number."

    override fun getStartsWithNumber(): String = "Should start with any number."

    override fun getStartsWith(): String = "Should start with"

    override fun getTextEqualTo(): String = "Should be equal to"

    override fun getTextNotEqualTo(): String = "Should not be equal to"

    override fun getValidNumber(): String = "Invalid Number!"

    override fun getValidUrl(): String = "Invalid web URL"
}