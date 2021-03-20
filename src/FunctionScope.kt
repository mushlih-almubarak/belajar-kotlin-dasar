/* Pada dasarnya, Kita bisa menjalankan/memanggil function dari file manapun dan dari function manapun
Namun kadang Kita ingin jika function tersebut hanya dapat dijalankan/dipanggil dari main function (contohnya), maka gunakan "Function Scope"
"Function Scope" berguna jika Kita ingin menjalankan suatu kode hanya pada suatu function
Contohnya Kita hanya ingin menjadikan function "satu" hanya bisa dijalankan/dipanggil dari function "main"
Maka Kita harus menggunakan fitur "Function Scope"
Cara menggunakannya adalah, dengan cara menuliskan function tersebut di dalam function yang Kita ingin hanya function tersebut yang bisa menjalankan/memenggilnya
Jika ingin function helloWorld hanya bisa dijalankan/dipanggil menggunakan main function, maka tuliskan function helloWorld di dalam main function tersebut
Ini juga dapat menyelesaikan bentrok jika ada nama-nama function yang sama
 */

fun satu(){
    println("Halo")
}

fun dua(){
    satu()
    // Tidak bisa memanggil fun tiga dari sini, karena fun tiga dituliskan dalam main fun
}

fun main() {
    fun tiga(){
        println("Assalamualaikum")
    }
    // fun tiga bisa dipanggil disini karena ia ditulis di dalam function ini, dan hanya fun ini hanya bisa memanggil fun tiga
    tiga()
}