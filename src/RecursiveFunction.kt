/* "Recursive function" adalah function yang memanggil function dirinya sendiri
Contoh kasus yang lebih mudah diselesaikan menggunakan recursive adalah Factorial
Factorial adalah perkalian mundur sampai 1, misal Kita menuliskan angka "10", maka ia akan mengkali 10*9*8*7*6*5*4*3*2*1 (kayaknya)
 */

// Dibawah ini adalah contoh factorial menggunakan "loop", bukan menggunakan "Recursive Function"
fun main() {
    fun factorialLoop(data: Int): Int {
        var hasil = 1
        for (angka in data downTo 1) {
            hasil *= angka
        }
        return hasil
    }
    println(factorialLoop(10))

    // Dibawah ini adalah contoh factorial menggunakan "Recursive Function"
    fun factorialRecursivee(dataa: Int):Int{
        var hasill = 1
        return when (dataa){
            1 -> 1
            else -> dataa * factorialRecursivee(dataa - 1) // Tanda bahwa ia adalah "Recursive Function", ada tanda (Seperti panah ulang yang ditegahnya ada warna hijau -fitur dari IDEA-)
        }
    }
    println(factorialRecursivee(10 ))
}