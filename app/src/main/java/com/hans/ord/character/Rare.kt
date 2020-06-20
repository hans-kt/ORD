package com.hans.ord.character

enum class Rare(private val unitName: String): UnitInterface {
    X_DRAKE("X-드레이크") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.TASIKI, UnCommon.HUKURO, Common.CHOPPA))
        }
    },
    GOD_ENEL("갓 에넬") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.USOP, UnCommon.BEPPO, Common.SANJI))
        }
    },
    MORIA("겟코모리아") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BRUK, UnCommon.BRUK, Common.SANJI))
        }
    },
    NAMI("나미 크리마텍트") {
        override fun getCombination(): Units {
            return Units(listOf(Common.NAMI, Common.NAMI, Common.NAMI))
        }
    },
    LUCHI("로브 루치") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.HUKURO, UnCommon.ROBIN, Common.LUFFY))
        }
    },
    ROBIN("로빈 오하라") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.ROBIN,UnCommon.ROBIN, Common.CHOPPA))
        }
    },
    LOW("트라팔가 로우") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BEPPO, UnCommon.TASIKI, Common.BURGGY))
        }
    },
    LUFFY("루피 기어세컨드") {
        override fun getCombination(): Units {
            return Units(listOf(Common.LUFFY, Common.LUFFY, Common.LUFFY))
        }
    },
    MARKO("마르코") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BLUNO, UnCommon.ACE, Common.SANJI))
        }
    },
    BAZIL("바질 호킨스") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.PERONA, UnCommon.BLUNO, Common.USOP))
        }
    },
    BURGY("버기 마기탄") {
        override fun getCombination(): Units {
            return Units(listOf(Common.BURGGY, Common.BURGGY, Common.BURGGY))
        }
    },
    BONGKURE("봉쿠레") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.INAZMA, UnCommon.ROBIN, Common.NAMI))
        }
    },
    SANJI("상디 검은다리") {
        override fun getCombination(): Units {
            return Units(listOf(Common.SANJI, Common.SANJI, Common.SANJI))
        }
    },
    SQUAD("스쿼드") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.CHOPPA, UnCommon.PRANKY, Common.NAMI))
        }
    },
    ARON("아론") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.HAZZI, UnCommon.HAZZI, Common.LUFFY))
        }
    },
    ABSALOM("압살롬") {
        override fun getCombination(): Units {
            return Units(listOf(ETC.ZOMBIE, ETC.ZOMBIE, ETC.ZOMBIE, Common.SANJI))
        }
    },
    ACE("에이스") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.ACE, UnCommon.ACE, Common.USOP))
        }
    },
    USOP("우솝 특별함") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.USOP, UnCommon.USOP))
        }
    },
    INAZMA("이나즈마 특별함") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.INAZMA, UnCommon.INAZMA))
        }
    },
    JORO("조로 귀기") {
        override fun getCombination(): Units {
            return Units(listOf(Common.JORO, Common.JORO, Common.JORO))
        }
    },
    CRO("캡틴 크로") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.HAZZI, Common.JORO, Common.KALBYUNG))
        }
    },
    JINBAE("징베") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.ACE, UnCommon.HUKURO, Common.BURGGY))
        }
    },
    CHAKA("챠카") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BLUNO, UnCommon.HUKURO, Common.CHOPPA))
        }
    },
    CHOPPA_BRAIN("쵸파 두뇌강화") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.CHOPPA, UnCommon.ROBIN, Common.BURGGY))
        }
    },
    CHOPPA_GUARD("쵸파 가드 포인트") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.CHOPPA, UnCommon.INAZMA, Common.KALBYUNG))
        }
    },
    KAPONE("카포네 갱뱃지") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.HUKURO, Common.BURGGY, Common.KALBYUNG))
        }
    },
    KUMA("쿠마") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BEPPO, UnCommon.PRANKY, Common.JORO))
        }
    },
    CROCODILE("크로커다일") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.PRANKY, UnCommon.USOP, Common.JORO))
        }
    },
    KID("유스타드 캡틴 키드") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.PERONA, UnCommon.BEPPO, Common.JORO))
        }
    },
    KILLER("킬러") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.TASIKI, UnCommon.BRUK, Common.JORO))
        }
    },
    SMOKER("스모커") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.TASIKI, Common.KALBYUNG, Common.CHONGBYUNG))
        }
    },
    PIROTS("파이러츠 도킹 5") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.PRANKY, UnCommon.PRANKY, Common.JORO))
        }
    },
    HERMEPO("헤르메포") {
        override fun getCombination(): Units {
            return Units(listOf(UnCommon.BRUK, Common.JORO, Common.SANJI))
        }
    };

    override fun getUnitName(): String {
        return unitName
    }
}