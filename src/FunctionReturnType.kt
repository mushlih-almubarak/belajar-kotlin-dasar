/* "Function Return Type" digunakan untuk mengembalikan suatu nilai
Gunakan kode "return" kemudian nama variabelnya untuk mengembalikan data
Mengembalikan data maksudnya adalah...?
Agar functionnya dapat mengembalikan data, tulis titik dua (:) kemudian tipe datanya kembaliannya (setelah tanda kurung setelah "fun namaFunction")
 */

fun jumlahkan(a:Int, b:Int): Int{
    val total = a + b
    return total
}

fun bagi(a:Int, b:Int): Int {
    if (b == 0) {
        // Karena 0 (nol) gak bisa dibagi, jadi tulis (nol) 0 aja
        return 0
    } else {
        val hasilPembagian = a / b
        return hasilPembagian
    }
}

fun main() {
    println(jumlahkan(10, 20))

    val hasil = jumlahkan(10, 20)
    println(hasil)

    println(bagi(100,10))
    println(bagi(100,0))
}