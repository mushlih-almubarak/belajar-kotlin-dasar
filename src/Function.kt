/* Function adalah blok kode yang berisi kode-kode untuk dijalanakan
Ada banyak function di Kotlin, tidak hanya yang "fun main", bisa juga kita yang buat seperti "fun Dakwah"
Di Kotlin function tidak bisa di spasi, jadi jika ingin membuat 2 kata di function maka gunakan "Camel Case"
"Camel Case" adalah menuliskan beberapa kata tanpa spasi, namun diberikan huruf besar pada kata kedua dan seterusnya, contoh "helloWorld"
Untuk menuliskan function di Kotlin, gunakan "fun namaFunction(){"
Untuk memanggil suatu function pada Kotlin, gunakan:
fun main() {
namaFunction()
}
Memanggil function maksudnya adalah, mencetak program pada yang ada pada function tersebut
 */

fun mutiaraDakwah(){
    println("Assalamualaikum")
}

fun dakwah(){
    println("Selamat Datang di Mutiara Dakwah")
}

fun Operasi(){
    val Pertambahan = 10 + 10
    println(Pertambahan)
}

fun main() {
    mutiaraDakwah()
    mutiaraDakwah()
    dakwah()
    dakwah()
    dakwah()
    Operasi()
}