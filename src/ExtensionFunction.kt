/* "Extension function" adalah cara untuk menambahkan function pada tipe data yang sudah ada
Untuk membuat "extension function", kita cukup menambahkan tipe data pada nama function nya, lalu diikuti dengan tanda . (titik)
Untuk mengakses data nya di extension function, kita bisa menggunakan kata kode "this"
Pada contoh kode dibawah ini, "Extension function"nya adalah "halo",, "salam", "umur", dan "alamat"
 */

fun String.halo(): String = "Assalamualaikumm $this"

fun String.salam():Unit = println("Assalamualaikum $this")

fun Int.umur(){
    println("Umur saya $this tahun")
}
fun String.alamat() = println("Saya tinggal di $this")

fun main() {
    // Data "this"nya ada di variabel nama dan umur
    val nama = "Mushlih"
    val umurr = 16
    val alamatt = "Riyadh"

    println(nama.halo())

    nama.salam()
    "Almubarak".salam()

    umurr.umur()
    alamatt.alamat()
}