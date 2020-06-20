package com.hans.ord.character

enum class Rare(private val unitName: String): UnitInterface {
    JORO_GUIGUI("조로 귀기") {
        override fun getCombination(): Units {
            return Units(listOf(Common.JORO, Common.JORO, Common.JORO))
        }
    },
    ARON("아론") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.HAZZI, UnCommon.HAZZI, Common.LUFFY))
        }
    };


    override fun getUnitName(): String {
        return unitName
    }
}