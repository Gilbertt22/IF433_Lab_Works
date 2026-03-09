package oop_00000125138_Gilbert.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n" + "=".repeat(30))

    println("=== TESTING SMART HOME SYSTEM ===")
    val hub = SmartHomeHub()

    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lampuTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    hub.activateSecurityMode()

    println("\n--- PERSIAPAN TIDUR (Turn Off All) ---")
    hub.turnOffAllSwitches()
}