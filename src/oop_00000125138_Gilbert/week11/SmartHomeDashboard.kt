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
}