package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphonseValidator
import com.atthapon.alphonsevalidator.extention.validNumber
import java.text.NumberFormat

class LessThanRule(
    var target: Number = 0,
    var errorMsg: String = String.format(AlphonseValidator.errorMessage.getLessThan(), target)
): BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        // Negative
        if (text.startsWith("-")) {
            var txtNum = text.substringAfter("-")
            if (txtNum.validNumber()) {
                var number = NumberFormat.getNumberInstance().parse(txtNum)
                number = number.toFloat() * -1
                return (number.toFloat() < target.toFloat())
            }
            return false
        }
        // Positive
        else {
            if (text.validNumber()) {
                var number = NumberFormat.getNumberInstance().parse(text)
                return (number.toFloat() < target.toFloat())
            }
            return false
        }
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}