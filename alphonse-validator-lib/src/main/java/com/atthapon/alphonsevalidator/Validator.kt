package com.atthapon.alphonsevalidator

import com.atthapon.alphonsevalidator.rules.*

class Validator(val text: String) {
    /*
     * Boolean to determine whether all the validations have passed successfully!
     * If any validation check is failed, then the value to
     * false and result is returned to developer
     */
    private var isValid = true

    /*
     The error message to be sent in the error callback
     */
    private var errorMessage: String = ""

    /*
     * In case of validation error or failure, this callback is invoked
     */
    var errorCallback: ((message: String) -> Unit)? = null

    /*
     * In case of validation success, this callback is invoked
     */
    var successCallback: (() -> Unit)? = null

    /*
     * The rules list to check for validation
     */
    var rulesList = ArrayList<BaseRule>()

    /*
     * Performs the validation check and returns true or false.
     * Also invokes success and error callbacks if non null.
     */
    fun check(): Boolean {
        for(rule in rulesList) {
            if(!rule.validate(text)) {
                rule.getErrorMessage()?.also { setError(it) }
                break
            }
        }

        // Invoking callbacks
        if(isValid) successCallback?.invoke() else errorCallback?.invoke(errorMessage)
        return isValid
    }

    fun setError(message: String) {
        isValid = false
        errorMessage = message
    }

    fun addRule(rule: BaseRule): Validator {
        rulesList.add(rule)
        return this
    }

    fun addErrorCallback(callback: (message: String) -> Unit): Validator {
        errorCallback = callback
        return this
    }

    fun addSuccessCallback(callback: () -> Unit): Validator {
        successCallback = callback
        return this
    }

    // Rules
    fun nonEmpty(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NonEmptyRule(it) } ?: NonEmptyRule()
        addRule(rule)
        return this
    }

    fun nonEmptyList(target: List<Any>, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NonEmptyListRule(target, it) } ?: NonEmptyListRule(target)
        addRule(rule)
        return this
    }

    fun nonBlank(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NonBlankRule(it) } ?: NonBlankRule()
        addRule(rule)
        return this
    }

    fun minLength(length: Int, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { MinLengthRule(length, it) } ?: MinLengthRule(length)
        addRule(rule)
        return this
    }

    fun maxLength(length: Int, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { MaxLengthRule(length, it) } ?: MaxLengthRule(length)
        addRule(rule)
        return this
    }

    fun validEmail(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { EmailRule(it) } ?: EmailRule()
        addRule(rule)
        return this
    }

    fun validNumber(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { ValidNumberRule(it) } ?: ValidNumberRule()
        addRule(rule)
        return this
    }

    fun greaterThan(number: Number, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { GreaterThanRule(number, it) } ?: GreaterThanRule(number)
        addRule(rule)
        return this
    }

    fun greaterThanOrEqual(number: Number, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { GreaterThanOrEqualRule(number, it) } ?: GreaterThanOrEqualRule(number)
        addRule(rule)
        return this
    }

    fun lessThan(number: Number, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { LessThanRule(number, it) } ?: LessThanRule(number)
        addRule(rule)
        return this
    }

    fun lessThanOrEqual(number: Number, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { LessThanOrEqualRule(number, it) } ?: LessThanOrEqualRule(number)
        addRule(rule)
        return this
    }

    fun numberEqualTo(number: Number, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NumberEqualToRule(number, it) } ?: NumberEqualToRule(number)
        addRule(rule)
        return this
    }

    fun allLowerCase(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { AllLowerCaseRule(it) } ?: AllLowerCaseRule()
        addRule(rule)
        return this
    }

    fun allUpperCase(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { AllUpperCaseRule(it) } ?: AllUpperCaseRule()
        addRule(rule)
        return this
    }

    fun atLeastOneUpperCase(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { AtLeastOneUpperCaseRule(it) } ?: AtLeastOneUpperCaseRule()
        addRule(rule)
        return this
    }

    fun atLeastOneLowerCase(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { AtLeastOneLowerCaseRule(it) } ?: AtLeastOneLowerCaseRule()
        addRule(rule)
        return this
    }

    fun atLeastOneNumber(errorMsg: String? = null): Validator {
        val rule =
            errorMsg?.let { AtLeastOneNumberCaseRule(it) } ?: AtLeastOneNumberCaseRule()
        addRule(rule)
        return this
    }

    fun noNumbers(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NoNumbersRule(it) } ?: NoNumbersRule()
        addRule(rule)
        return this
    }

    fun onlyNumbers(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { OnlyNumbersRule(it) } ?: OnlyNumbersRule()
        addRule(rule)
        return this
    }

    fun startWithNumber(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { StartsWithNumberRule(it) } ?: StartsWithNumberRule()
        addRule(rule)
        return this
    }

    fun startWithNonNumber(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { StartsWithNoNumberRule(it) } ?: StartsWithNoNumberRule()
        addRule(rule)
        return this
    }

    fun noSpecialCharacters(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NoSpecialCharacterRule(it) } ?: NoSpecialCharacterRule()
        addRule(rule)
        return this
    }

    fun atLeastOneSpecialCharacters(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { AtLeastOneSpecialCharacterRule(it) } ?: AtLeastOneSpecialCharacterRule()
        addRule(rule)
        return this
    }

    fun textEqualTo(target: String, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { TextEqualToRule(target, it) } ?: TextEqualToRule(target)
        addRule(rule)
        return this
    }

    fun textNotEqualTo(target: String, errorMsg: String? = null): Validator {
        val rule =
            errorMsg?.let { TextNotEqualToRule(target, it) } ?: TextNotEqualToRule(target)
        addRule(rule)
        return this
    }

    fun startsWith(target: String, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { StartsWithRule(target, it) } ?: StartsWithRule(target)
        addRule(rule)
        return this
    }

    fun endsWith(target: String, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { EndsWithRule(target, it) } ?: EndsWithRule(target)
        addRule(rule)
        return this
    }

    fun contains(target: String, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { ContainsRule(target, it) } ?: ContainsRule(target)
        addRule(rule)
        return this
    }

    fun notContains(target: String, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NotContainsRule(target, it) } ?: NotContainsRule(target)
        addRule(rule)
        return this
    }

    fun notContainsInList(target: List<Any>, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { NotContainsInList(target, it) } ?: NotContainsInList(target)
        addRule(rule)
        return this
    }

    fun creditCardNumber(
        creditCardErrorMsg: String? = null,
        minLengthErrorMsg: String? = null,
        maxLengthErrorMsg: String? = null
    ): Validator {
        val minLengthRule = minLengthErrorMsg?.let { MinLengthRule(16, it) } ?: MinLengthRule(16)
        val maxLengthRule = maxLengthErrorMsg?.let { MaxLengthRule(16, it) } ?: MaxLengthRule(16)
        val creditCardRule = creditCardErrorMsg?.let { CreditCardRule(it) } ?: CreditCardRule()
        addRule(minLengthRule)
        addRule(maxLengthRule)
        addRule(creditCardRule)
        return this
    }

    fun creditCardNumberWithSpaces(
        creditCardErrorMsg: String? = null,
        minLengthErrorMsg: String? = null,
        maxLengthErrorMsg: String? = null
    ): Validator {
        val minLengthRule = minLengthErrorMsg?.let { MinLengthRule(16, it) } ?: MinLengthRule(19)
        val maxLengthRule = maxLengthErrorMsg?.let { MaxLengthRule(16, it) } ?: MaxLengthRule(19)
        val creditCardRule = creditCardErrorMsg?.let { CreditCardWithSpacesRule(it) } ?: CreditCardWithSpacesRule()
        addRule(minLengthRule)
        addRule(maxLengthRule)
        addRule(creditCardRule)
        return this
    }

    fun creditCardNumberWithDashes(
        creditCardErrorMsg: String? = null,
        minLengthErrorMsg: String? = null,
        maxLengthErrorMsg: String? = null
    ): Validator {
        val minLengthRule = minLengthErrorMsg?.let { MinLengthRule(16, it) } ?: MinLengthRule(19)
        val maxLengthRule = maxLengthErrorMsg?.let { MaxLengthRule(16, it) } ?: MaxLengthRule(19)
        val creditCardRule = creditCardErrorMsg?.let { CreditCardWithDashesRule(it) } ?: CreditCardWithDashesRule()
        addRule(minLengthRule)
        addRule(maxLengthRule)
        addRule(creditCardRule)
        return this
    }

    fun validUrl(errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { ValidUrlRule(it) } ?: ValidUrlRule()
        addRule(rule)
        return this
    }

    fun regex(pattern: String, errorMsg: String? = null): Validator {
        val rule = errorMsg?.let { RegexRule(pattern, it) } ?: RegexRule(pattern)
        addRule(rule)
        return this
    }
}