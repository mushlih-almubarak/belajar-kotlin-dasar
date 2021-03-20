/* "Function Parameter" adalah cara untuk menampilkan data dari luar
Cara menampilkan datanya adalah dengan cara memasukkan datanya ke dalam tanda kurung "()"
Setelah menuliskan data di dalam kurung, gunakan titik dua kemudian tipe datanya, contoh: "namaDepan:String"
Untuk memanggil "Function Parameter", gunakan "namaFunction("DataA", "DataB")
Function ini bisa juga datanya "null"
Kita bisa memasukkan berapapun Function Parameter pada Kotlin
 */

// Masukkan nama datanya di dalam tanda kurung setelah nama functionnnya, kemudian tulis tida datanya (String, Int, dll)
fun nama(namaDepan:String, namaBelakang:String){
    println("Nama saya $namaDepan $namaBelakang")
}

// Agar datanya bisa null, gunakan kode seperti dibawah ini (menggunakan if else), dan juga gunakan tanda ? setelah tipe data yang bisa "null"
fun namaLengkap(namaDepann:String, namaTengah:String?, namaBelakangg: String) {
    if (namaTengah == null) {
        println("Nama Saya $namaDepann $namaBelakangg")
    } else {
        println("Nama Saya $namaDepann $namaTengah $namaBelakangg")
    }
}

// Masukkan datanya dalam tanda kurung "()" setelah nama functionnya
fun main() {
    nama("Mushlih", "Almubarak")
    namaLengkap("Muhammad", "Al", "Hadziq")
    // Jika ingin null datanya (tidak ada data), gunakan kode "null" pada data parameternya tanpa tanda petik ""
    namaLengkap("Mushlih", null, "Almubarak")
}