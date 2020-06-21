package com.hans.ord.character

enum class Unique(private val unitName: String): UnitInterface {
    AOKIZI("아오키지") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.ROBIN, Rare.SQUAD, Rare.GOD_ENEL))
        }
    },
    KID("유스타드 캡틴 키드") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.KID, Rare.NAMI, Rare.KILLER))
        }
    },
    PERONA("페로나") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.ABSALOM, UnCommon.PERONA, Rare.SANJI, Rare.CHOPPA_BRAIN))
        }
    },
    CROCODILE("크로커다일") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.CROCODILE, Rare.JINBAE, Rare.BONGKURE))
        }
    },
    GOD_ENEL("갓에넬 뇌신") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.GOD_ENEL, Rare.SANJI, Rare.USOP))
        }
    },
    GUFF("거프") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.SMOKER, Rare.X_DRAKE, Rare.LUFFY))
        }
    },
    DARK_BEARD("검은수염") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.ACE, Rare.SQUAD, Rare.X_DRAKE))
        }
    },
    DOFLAMINGO("도플라밍고") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.CHOPPA_GUARD, Rare.BURGY, Rare.LUCHI))
        }
    },
    LOW("트라팔가로우") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.LOW, Rare.PIROTS, Rare.CHOPPA_BRAIN))
        }
    },
    LUFFY("루피 기어서드") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.LUFFY, Rare.BONGKURE, Rare.GOD_ENEL))
        }
    },
    REWMA("류마") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.MORIA, Rare.JORO, UnCommon.PERONA, UnCommon.USOP, Common.KALBYUNG))
        }
    },
    MARKO("마르코") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.MARKO, Rare.CHAKA, Rare.CHOPPA_GUARD))
        }
    },
    MAJELAN("마젤란") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.JINBAE, Rare.BURGY, Rare.ACE))
        }
    },
    MOMONGA("모몬가") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.JINBAE, Rare.HERMEPO, Rare.SMOKER))
        }
    },
    MIHOK("미호크") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.JORO, Rare.CRO, Rare.X_DRAKE))
        }
    },
    BARTOROMEO("바르톨로메오") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.CRO, Rare.ARON, Rare.PIROTS))
        }
    },
    BAZES("바제스") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.BAZIL, Rare.MARKO, Rare.BURGY))
        }
    },
    BAZIL("바질호킨스 항마의 상") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.BAZIL, Rare.KILLER, Rare.LOW))
        }
    },
    BANDEODEKEN("반더데켄") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.ARON, Rare.HERMEPO, Rare.JINBAE))
        }
    },
    BABY5("베이비5") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.PIROTS, Rare.KUMA, Rare.LUCHI))
        }
    },
    BENBEKMAN("벤베크만") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.USOP, Rare.SMOKER, Rare.GOD_ENEL))
        }
    },
    BRUK("브룩") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BRUK, Rare.MORIA, Rare.LUCHI))
        }
    },
    BIBI("비비") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.CHAKA, Rare.CROCODILE, Rare.NAMI))
        }
    },
    SABO("사보") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.INAZMA, Rare.KUMA, Rare.MARKO))
        }
    },
    SANJI("상디 디아블잠브") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.SANJI, Rare.CHOPPA_GUARD, Rare.KID))
        }
    },
    SHANKS("샹크스") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.BURGY, Rare.LUFFY, Rare.USOP))
        }
    },
    CENTOMARU("센토마루") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.KUMA, Rare.CHOPPA_BRAIN, Rare.KAPONE))
        }
    },
    SUGAR("슈가") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.CHOPPA_BRAIN, Rare.JORO, UnCommon.PERONA, Common.USOP))
        }
    },
    SIRYU("시류") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.X_DRAKE, Rare.KAPONE, Rare.SANJI))
        }
    },
    AKAINU("아카이누") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.ARON, Rare.CROCODILE, Rare.INAZMA))
        }
    },
    OZ("오즈") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.MORIA, Rare.MORIA, Rare.LUFFY))
        }
    },
    USOP("우솝") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.USOP, Rare.KAPONE, Rare.NAMI))
        }
    },
    IWANCOB("이완코브") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.INAZMA, Rare.ROBIN, Rare.CROCODILE))
        }
    },
    JEF("제프") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.BONGKURE, Rare.BAZIL, Rare.INAZMA))
        }
    },
    JORO("조로 아수라") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.JORO, Rare.MORIA, Rare.SMOKER))
        }
    },
    CHOPPA("쵸파 혼 포인트") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.CHOPPA_GUARD, Rare.HERMEPO, Rare.LOW))
        }
    },
    ZYOZ("죠즈") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.SQUAD, Rare.CRO, Rare.KAPONE))
        }
    },
    KAKU("카쿠") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.LUCHI, Rare.CHAKA, Rare.ROBIN))
        }
    },
    KIZARU("키자루") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.HERMEPO, Rare.LOW, Rare.KID))
        }
    },
    KINEMON("킨에몬") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.KILLER, Rare.ACE, Rare.CRO))
        }
    },
    HANKOK("핸콕") {
        override fun getCombination(): Units {
            return Units(listOf(Rare.NAMI, Rare.ARON, Rare.LUFFY))
        }
    };

    override fun getUnitName(): String {
        return unitName
    }
}