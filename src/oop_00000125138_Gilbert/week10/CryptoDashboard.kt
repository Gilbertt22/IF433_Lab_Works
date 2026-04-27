package oop_00000125138_Gilbert.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.25))
    coinRepo.add(Coin("USDT", 1500.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1200.5))
    txRepo.add(Transaction("TX003", 75.25))
}