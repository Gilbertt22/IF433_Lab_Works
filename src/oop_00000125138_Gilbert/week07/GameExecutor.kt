package oop_00000125138_Gilbert.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("PERTARUNGAN DIMULAI! Anda bertemu dengan: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (itemName, _, rarity) = event.item
            println("LOOT DITEMUKAN! Anda mendapatkan [$itemName] dengan kelangkaan $rarity")
        }

        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("ZONA AMAN: Anda bisa beristirahat sejenak di sini.")
        }
    }
}