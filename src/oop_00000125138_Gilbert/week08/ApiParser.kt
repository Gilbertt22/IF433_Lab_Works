package oop_00000125138_Gilbert.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(id)!!
        when (product) {
            is Electronic -> {
                println("Processing Electronic: ${product.name} (Warranty ${product.warrantyMonths})")
            }
            is Clothing -> {
                println("Processing Clothing: ${product.name} (Size ${product.size})")
            }
        }
        println("Transaction ID: $transactionId")
    }

}