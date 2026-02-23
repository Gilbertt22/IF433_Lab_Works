package oop_00000125138_Gilbert.week04

class Manager(name: String, baseSalary: Int, val teamSize: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang mengelola tim yang terdiri dari $teamSize orang.")
    }

    override fun calculateBonus(): Int {
        val standardBonus = super.calculateBonus()
        val teamBonus = teamSize * 500
        return standardBonus + teamBonus
    }
}