package oop_00000125138_Gilbert.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Recordable {

    override fun startRecord() {
        println("Kamera $name (ID: $id) mulai merekam kejadian...")
    }
}