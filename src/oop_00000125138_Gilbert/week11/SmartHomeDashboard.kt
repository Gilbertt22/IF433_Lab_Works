package oop_00000125138_Gilbert.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    val smartLamp = SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    val securityCamera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
    val acInverter = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acInverter)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        val diagnosticInfo = it.diagnose()
        println(diagnosticInfo)
    }
    with(homeDevices) {
        println("Total Perangkat Terdaftar: ${this.size}")
    }
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total Konsumsi Daya: $totalPower Watt")
}