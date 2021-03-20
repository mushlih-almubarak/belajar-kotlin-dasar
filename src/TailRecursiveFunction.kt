/* Jika suatu function memanggil dirinya sendiri dengan panggilan yang sangat dalam, maka akan terjadi error stack overlow
Errornya bebeda beda pada setiap laptop, tergantung spek yang dipakai
Mislanya kita menulis kode untuk menghitung dari angkan 10.000 ke angka 0, maka akan error stack overlow karena terlalu banyak angkanya
Agar tidak terjadi error, maka tambahkan "Tail Recursive", kodenya "tailrec" sebelum tulisan "fun"
Dengan cara itu, maka Kotlin akan secara otomatis mengubah "Tail Recursive Function" menjadi looping biasa, dan tidak terjadi error
Tapi jika menggunakan fitur ini, Kita tidak bisa menambahkan oprasi yang lain, misalnya setelah - (kurang), * (kali), kemudian + (tambah), dst. Maka itu tida bisa
*/

fun main() {
    tailrec fun hitungMundur(angka: Int){
        println("Angka ke $angka")
                if (angka>0){
                    hitungMundur(angka - 1)// Tidak bisa menambahkan oprasi lainnya setelah tanda (-) kurang
                }
    }
    hitungMundur(10000)
}