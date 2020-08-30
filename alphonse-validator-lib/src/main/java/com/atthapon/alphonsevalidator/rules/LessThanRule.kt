package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.validNumber
import java.text.NumberFormat

class LessThanRule(val target: Number = 0, var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        if(text.isEmpty()) return false
        if(text.startsWith("-")) {
            val txtNum = text.substringAfter("-")
            if(txtNum.validNumber()) {
                var number = NumberFormat.getNumberInstance().parse(txtNum)
                number = number.toFloat() * -1
                return (number.toFloat() < target.toFloat())
            }
            return false
        } else {
            if(text.validNumber()) {
                val number = NumberFormat.getNumberInstance().parse(text)
                return (number.toFloat() < target.toFloat())
            }
            return false
        }
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}