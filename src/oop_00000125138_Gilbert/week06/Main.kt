package oop_00000125138_Gilbert.week06

fun main() {
    val hub = SmartHomeHub()

    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lampuTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    hub.activateSecurityMode()

    hub.turnOffAllSwitches()
}