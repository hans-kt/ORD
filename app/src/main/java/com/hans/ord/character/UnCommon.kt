package com.hans.ord.character

enum class UnCommon(private val unitName: String): UnitInterface {
    ROBIN("로빈") {
        override fun getCombination(): Units {
            return Units(listOf(Common.NAMI, Common.SANJI))
        }
    },
    BLUNO("블루노") {
        override fun getCombination(): Units {
            return Units(listOf(Common.CHONGBYUNG, Common.CHONGBYUNG))
        }
    },
    BEPPO("베포") {
        override fun getCombination(): Units {
            return Units(listOf(Common.CHOPPA, Common.LUFFY))
        }
    },
    BRUK("브룩") {
        override fun getCombination(): Units {
            return Units(listOf(Common.JORO, Common.CHOPPA))
        }
    },
    ACE("에이스") {
        override fun getCombination(): Units {
            return Units(listOf(Common.LUFFY, Common.CHONGBYUNG))
        }
    },
    INAZMA("이나즈마") {
        override fun getCombination(): Units {
            return Units(listOf(Common.SANJI, Common.JORO))
        }
    },
    USOP("져격왕 우솝") {
        override fun getCombination(): Units {
            return Units(listOf(Common.USOP, Common.USOP))
        }
    },
    CHOPPA("쵸파 럼블볼") {
        override fun getCombination(): Units {
            return Units(listOf(Common.CHOPPA, Common.CHOPPA))
        }
    },
    TASIKI("타시기") {
        override fun getCombination(): Units {
            return Units(listOf(Common.KALBYUNG, Common.CHONGBYUNG))
        }
    },
    PERONA("페로나") {
        override fun getCombination(): Units {
            return Units(listOf(Common.BURGGY, Common.NAMI))
        }
    },
    PRANKY("프랑키") {
        override fun getCombination(): Units {
            return Units(listOf(Common.USOP, Common.LUFFY))
        }
    },
    HAZZI("하찌") {
        override fun getCombination(): Units {
            return Units(listOf(Common.CHONGBYUNG, Common.NAMI))
        }
    },
    HUKURO("후쿠로") {
        override fun getCombination(): Units {
            return Units(listOf(Common.KALBYUNG, Common.KALBYUNG))
        }
    };

    override fun getUnitName(): String {
        return unitName
    }
}