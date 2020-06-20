package com.hans.ord.character

data class Units(
    val list: List<UnitInterface>
) {
    override fun toString(): String {
        var result = ""
        list.forEach {
            result += it.getUnitName() + " "
        }
        return result
    }
}

enum class UnitGrade(val grade: String) {
    COMMON("흔함"),
    UNCOMMON("안흔함"),
    RARE("특별함")
}