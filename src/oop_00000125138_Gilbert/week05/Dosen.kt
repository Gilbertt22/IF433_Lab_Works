package oop_00000125138_Gilbert.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}
