/* Ini adalah Constant, Constant maksudnya data tersebut bisa dikses oleh semua orang dari mana pun
   Karena data tersebut bisa diakses semua orang, maka ia harus diletakkan di luar program (fun main)
   Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan HURUF_KAPITAL dalam pembuatan nama variable constant nya
 */

const val APLIKASI = "Belajar Kotlin"
const val VERSI = "0.0.1"

fun main() {

    /*
    Variable di Kotlin ada 2, yaitu yang bisa diubah nilainya (var), dan yang tidak dapat diubah nilainya (val)
    Jika kita menulis:
    val namaDepan = Mushlih
    namaDepan = Hadziq
    println(namaDepan)
    Maka itu akan menjadi error karena kita menggunakan variable "val", dan variable "val" tidak dapat diubah nilainya

    Sedangkan jika kita menulis:
    var namaDepan = Mushlih
    namaDepan = Hadziq
    println(namaDepan)
    Maka itu tidak akan error (dan namanya akan menjadi "Hadziq"), karena kita menggunakan variable "var", dan variable "var" dapat diubah nilainya
     */

    // Direkomendasikan menggunakan Immutable (Tidak dapat diubah atau "val") dibanding Mutable (Dapat diubah atau "var") data, jika memang data tersebut tidak dapat diubah

    val namaDepan = "Mushlih"
    val umur = 16

    println(namaDepan)
    println(umur)

    /* "null" digunakan untuk memberi tahu bahwa nilai/data tersebut tidak ada
    Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan "?" (tanda tanya) setelah tipe datanya.
    Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java
     */

    val tanpaNama: String? = null
    println(tanpaNama)

    /* Harus menggunakan tanda "?" setelah menuliskan tipe data di dalam println, agar kotlin tau bahwa itu adalah null (tidak ada datanya)
    dan hasilnya akan tetap "null" karena memang datanya tidak ada, dan dia tidak menghitung berapa huruf pada kata "null"
     */
    println(tanpaNama?.length)

    // Kode dibawah ini untuk mencetak nama dan versi aplikasi yang ditulis di paling atas (di Constant)
    println("$APLIKASI : $VERSI")
}