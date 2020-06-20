package com.hans.ord.character

interface UnitInterface {
    fun getCombination(): Units
    fun getUnitName(): String
    fun getCommonUnitCount(): Map<String, Int> {
        return HashMap<String,Int>().apply {
            getCombination().list.forEach {
                recursive(it).also { map ->
                    map.entries.forEach { entry ->
                        if(containsKey(entry.key)) {
                            put(entry.key, get(entry.key)!! + entry.value)
                        } else {
                            put(entry.key, entry.value)
                        }
                    }
                }
            }
        }
    }

    private fun recursive(unit: UnitInterface): HashMap<String, Int> {
        return HashMap<String,Int>().apply {
            unit.getCombination().list.forEach {
                if(it !is Common && it !is ETC) {
                    recursive(it).also { map ->
                        map.entries.forEach { entry ->
                            if(containsKey(entry.key)) {
                                put(entry.key, get(entry.key)!! + entry.value)
                            } else {
                                put(entry.key, 1)
                            }
                        }
                    }
                } else {
                    if(containsKey(it.getUnitName())) {
                        put(it.getUnitName(), get(it.getUnitName())!! + 1)
                    } else {
                        put(it.getUnitName(), 1)
                    }
                }
            }
        }
    }
}