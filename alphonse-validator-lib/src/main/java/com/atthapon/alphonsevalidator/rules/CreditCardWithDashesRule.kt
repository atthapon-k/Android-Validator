package com.atthapon.alphonsevalidator.rules

class CreditCardWithDashesRule(var errorMsg: String? = null): BaseRule {
    override fun validate(text: String): Boolean {
        val patterns = ArrayList<String>()
        val visaPattern = "^4[0-9]{6,}$"
        val masterCardPattern = "^5[1-5][0-9]{5,}$"
        val ameExpPattern = "^3[47][0-9]{5,}$"
        val dinClbPattern = "^3(?:0[0-5]|[68][0-9])[0-9]{4,}$"
        val discoverPattern = "^6(?:011|5[0-9]{2})[0-9]{3,}$"
        val jcbPattern = "^(?:2131|1800|35[0-9]{3})[0-9]{3,}$"
        patterns.add(visaPattern)
        patterns.add(masterCardPattern)
        patterns.add(ameExpPattern)
        patterns.add(dinClbPattern)
        patterns.add(discoverPattern)
        patterns.add(jcbPattern)

        val newText = text.replace("-", "")

        return patterns.any { newText.matches(Regex(it)) }
    }

    override fun getErrorMessage() = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}