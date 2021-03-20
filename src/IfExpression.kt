/* If Expression adalah cara yang digunakan untuk menulis sesuatu jika suatu kondisi terpenuhi,
  misalnya jika ia lulus maka ia akan mendapatkan ucapan selamat, sedaangkan jika ia gagal maka ia akan mendapatkan ucapan coba lagi
  Rumusnya
  if (nilaiBoolean > 80) {
      println("Mantap")
   Kode diatas menunjukkan jika ia mendapatkan nilai diatas 80 maka berikan ia ucapan "Mantap"
   */

fun main() {
    val nilaiA = 85

    if (nilaiA > 75) {
        println("Mantap")
    }

    // "If" digunakan untuk mengeksekusi suatu program jika nilai tersebut benar, sedangkan "else" digunakan jika nilai tersebut salah
    val nilaiB = 60

    if (nilaiB > 75) {
        println("Mantap")
    } else {
        println("Coba Lagi Nanti")
    }

    /* Untuk membuat beberapa kondisi, seperti "sangat bagus", "bagus", "lumayan", "buruk", "sangat buruk". Maka gunakan kode "else if"
    Else if bisa digunakan sampai berapapun, dan pada terakhir jika tidak ada lagi kondisi yang mau ditulis, gukana "else" yang berarti kondisi lainnya atau "cetak program ini jika semua kondisi diatas tidak ada terpenuhi"
     */
    val nilaiC = 84

    if (nilaiC > 90) {
        println("Sangat Bagus")
    } else if (nilaiC > 80) {
        println("Bagus")
    } else if (nilaiC > 70 ) {
        println("Lumayan")
    } else if (nilaiC > 60) {
        println("Buruk")
    } else if (nilaiC > 50) {
        println("Sangat Buruk")
    } else {
        println("Anda gagal")
    }
}