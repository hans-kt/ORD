package com.hans.ord.character

data class Units(
    val list: List<UnitInterface>
) {
    override fun toString(): String {
        var result = ""
        list.forEachIndexed { index, unit ->
            result += unit.getUnitName() + if(index != list.size - 1) ", " else ""
        }
        return result
    }
}

enum class UnitGrade(val grade: String) {
    NO_GRADE("등급선택"),
    COMMON("흔함"),
    UNCOMMON("안흔함"),
    RARE("특별함"),
    UNIQUE("희귀함")
}