/* "Function Default Parameter" adalah parameter deafult (data deafult) yang akan dimasukkan jika tidak ada data yang dimasukkan
Untuk memasukkan data deafult, gunakan kode "=" (sama dengan) setelah tipe data, kemudian isikan deafult parameternya
Parameter deafult akan dipakai jika tidak ada parameter (data) yang dimasukkan
Sedangkan jika parameternya (datanya) dimasukkan, maka yang diambil adalah parameter (data) yang dimasukkan, bukan parameter (data) deafult
Tidak boleh menggunakan 2 nama function yang sama di Kotlin karena bisa terjadi konflik, walaupun functionnya di file yang berbeda
 */

fun namaDeafult(namaDepan: String, namaBelakang: String = ""){
    println("Assalamualaikum $namaDepan $namaBelakang")
}

fun main() {
    namaDeafult("Mushlih", "Almubarak")
//Tidak perlu memasukkan data/parameter namaBelakang, tidak perlu juga memasukkan kode "null", karena sudah ada data deafult yang akan disikan untuk nama belakang
    namaDeafult("Mushlih")
}