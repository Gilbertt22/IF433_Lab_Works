package oop_00000125138_Gilbert.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Lamp $name (ID: $id) sekarang menyala.")
    }

    override fun turnOff() {
        println("Smart Lamp $name (ID: $id) telah dimatikan.")
    }
}