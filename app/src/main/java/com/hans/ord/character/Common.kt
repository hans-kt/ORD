package com.hans.ord.character

enum class Common(private val unitName: String): UnitInterface {
    LUFFY("루피") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    JORO("조로") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    NAMI("나미") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    SANJI("상디") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    CHOPPA("쵸파") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    USOP("우솝") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    KALBYUNG("해군칼병") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    CHONGBYUNG("해군총병") {
        override fun getCombination(): Units = Units(listOf(this))
    },
    BURGGY("버기") {
        override fun getCombination(): Units = Units(listOf(this))
    };

    override fun getUnitName(): String {
        return unitName
    }

    override fun getCommonUnitCount(): Map<String, Int> {
        return HashMap<String, Int>().apply { put(unitName, 1) }
    }
}