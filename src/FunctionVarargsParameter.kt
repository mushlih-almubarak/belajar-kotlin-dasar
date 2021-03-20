/* "FunctionVarargsParameter" hampir sama seperti "Array"
Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
JIka parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma
Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
Varargs hanya bisa di taruh di posisi terakhir
 */

fun hitungTotal(nama:String, vararg isi: Int ):Int {
    var total = 0
    for (value in isi) {
        total += value
    }
    return total
}

fun main() {
    val hasil = hitungTotal("Mushlih",10, 10, 10, 10, 10)
    println(hasil)
}
