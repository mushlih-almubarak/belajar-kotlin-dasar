/* "Closure" adalah kemampuan sebuah function, lamda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama
Harap gunakan fitur ini dengan hati-hati, karena ia bisa merubah data yang ada di dalam scope
 */

fun main() {
    var hitung: Int = 0

    val contohLamda = {
        println("Ini adalah contoh lamda")
        hitung++
    }

    val contohAnomyus = {
        println("Ini adalah Contoh Anomyus")
        hitung++
    }

    val contohFunction = {
        println("Ini adalah contoh function")
        hitung++
    }


    contohLamda()
    contohAnomyus()
    contohFunction()
    contohLamda()
    contohAnomyus()
    contohFunction()

    println(hitung)
}