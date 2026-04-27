package oop_00000125138_Gilbert.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    fun <T : Nameable> findByName(query: String, itemsToSearch: List<T>): T? {
        return itemsToSearch.find { it.name.equals(query, ignoreCase = true) }
    }
}