package oop_00000125138_Gilbert.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.25))
    coinRepo.add(Coin("USDT", 1500.0))
}