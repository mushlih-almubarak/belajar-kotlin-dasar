/* Setiap bahasa pemrograman ada yang namanya perulangan, dan dikotlin salah satu nama perulangannya adalah "For Loop"
Digunakan untuk memprint data semuanya secara otomatis (Bukan satu-satu)
Contohnya digunakan untuk mencetak semua nama (data) yang ada di dalam data "Array"
Gunakan kode "for" diawalnya, dan "in" di tengah di dalam kurungnya
 */
fun main() {

    var anggota = arrayOf("Mushlih", "Syakira", "Hadziq", "Abi", "Umi")
    for (namaB in anggota) {
        println(namaB)
    }

    // Untuk menghitung berapa jumlah data yang di cetak tersebut, gunakan kode dibawah ini
    var total = 0
    var jumlahAnggota = arrayOf("Mushlih", "Syakira", "Hadziq", "Abi", "Umi")
    for (nama in jumlahAnggota) {
        println(nama)
        total++
    }
    println("Jumlah data = $total")


    // Semua kode diatas adalah untuk "Array", fitur "ForLoop" bisa juga di gunakan untuk range, range itu seperti yang 0.100, jadi dia menulis dari 0 - 100

    for (cetakBiasa in 0..100) {
        println(cetakBiasa)
    }

    // Atau bisa juga jika ingin mencetak setiap 2 angka
    for (cetakLompatDua in 0..100 step 2) {
        println(cetakLompatDua)
    }

    // Atau bisa juga cetak menurun
    for (cetakMenurun in 100 downTo 0) {
        println(cetakMenurun)
    }

    // Atau bisa juga cetak menurun tapi lompat 5 langkah
    for (cetakMenurunLompat in 100 downTo 0 step 5) {
        println(cetakMenurunLompat)
    }

    // Atau bisa juga dikominasikan antara array dan range
    val SemuaNama = anggota.size - 1 // Dikurang satu (-1) karena dihitungnya dari 0
    // Programmer biasanya menggunakan "i" untuk index
    for (i in 0..SemuaNama) {
        println("Nama $i = ${anggota.get(i)}")
    }
}