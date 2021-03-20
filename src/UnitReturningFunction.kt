/* "Function" di Kotlin ada 2, yaitu yang tidak mengembalikan data dan yang mengembalikan data
Function yang digunakan sebelum ini adalah yang tidak mengembalikan data
Function yang digunakan sebelum ini sebenarnya menggunakan kode "Unit", yang berarti bahwa function tersebut tidak mengembalikan data
Penulisan "Unit" tidaklah wajib, makanya di function yang dibuat sebelum ini tidak ada kode "Unit" yang ditulis
Tidak ada perbedannya jika Kita menuliskan "Unit" pada "function", ataupun tidak menuliskannya
 */

fun pakaiUnit(namaLengkap:String = "Mushlih"): Unit {
    println("Assalamualaikum $namaLengkap")
}

fun tanpaUnit(nama:String = "Mushlih"){
    println("Assalamualaikum $nama")
}

fun main() {
    pakaiUnit()
    tanpaUnit()
}