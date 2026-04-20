package oop_00000125138_Gilbert.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 50, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 10, -2.1, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 20, 12.8, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 100, 45.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 30, -10.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
}