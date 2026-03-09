package oop_00000125138_Gilbert.week06

interface Clickable {
    val name: String
    fun click()

}
class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}