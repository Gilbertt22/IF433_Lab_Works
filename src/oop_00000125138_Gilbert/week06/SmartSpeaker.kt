package oop_00000125138_Gilbert.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker $name (ID: $id) sekarang aktif.")
    }

    override fun turnOff() {
        println("Smart Speaker $name (ID: $id) telah dinonaktifkan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}