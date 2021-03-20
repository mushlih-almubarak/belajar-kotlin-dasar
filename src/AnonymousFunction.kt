/* Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
Untuk hal ini, kita bisa menggunakan Anonymous Function
"Anonymous Function" sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci fun
 */

fun main() {
    fun namaHurufKapital(Nama: String, ubahHuruf: (String) -> String): String {
        val kapitalkanNama = ubahHuruf(Nama)
        return "Assalamualaikum $kapitalkanNama"
    }
        val besarKecil = fun(nama: String): String {
            if (nama == "") {
                return "User".toLowerCase()
            } else {
                return nama.toUpperCase()
            }
        }

        println(namaHurufKapital("Mushlih", besarKecil))
        println(namaHurufKapital("", besarKecil))

    // Bisa juga dimasukkan langsung "Anonymous Function"nya dalam 1 baris seperti lambda
        println(namaHurufKapital("Mushlih", fun(nama: String): String {
            return nama.toLowerCase()
        }))

}