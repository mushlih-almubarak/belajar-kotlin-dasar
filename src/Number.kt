fun main() {
    /*
    Ini adalah tipe data Interger Number dan Floating Point Number
    Screenshot ukuran minimal dan maksimal Interger Number: https //p rnt.sc/xppdv3
    Screenshot ukuran minimal dan maksimal Floating Point Number: https //p rnt.sc/xppsyn
     */

    // Kata "umur" setelah kata "var" bukan kode, namun itu adalah nama yang kita buat sendiri
    var umur: Int = 200
    println(umur)

    // Kata "binary" setelah kata "var" bukan kode, namun itu adalah nama yang kita buat sendiri
    var binary: Int = 0b010101010
    println(binary)

    // Kata "harga" setelah kata "var" bukan kode, namun itu adalah nama yang kita buat sendiri
    var harga: Long =  9_000_000_000
    println(harga)

    // Kata "contoh" setelah kata "var" bukan kode, namun itu adalah nama yang kita buat sendiri
    var contoh: Float = 10.11F
    println(contoh)


    // Dibawah ini adalah contoh pengkonversian "Harga" ke "Int" (Interger Number)
    var KonversiHargaKeInt: Int = harga.toInt()
    println(KonversiHargaKeInt)

    // Dibawah ini adalah contoh pengkonversian "Binary" ke Double (Floating Point Number)
    var KonversiBinaryKeDouble: Double = binary.toDouble()
    println(KonversiBinaryKeDouble)
}