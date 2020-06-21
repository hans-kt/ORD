package com.hans.ord.character

enum class ETC(private val unitName: String): UnitInterface {
    ZOMBIE("좀비"),
    TREE("나무");

    override fun getUnitName(): String {
        return unitName
    }

    override fun getCombination(): Units {
        return Units(listOf(this))
    }

    override fun getCommonUnitCount(): Map<String, Int> {
        return HashMap<String, Int>().apply { put(unitName, 1) }
    }
}