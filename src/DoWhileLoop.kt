fun main() {
    /* Perulangan "While" mirip dengan perlungan "DoWhile"
    Yang membedakannya adalah kalau "While" dia akan mengecek kondisinya terlebih dahulu,
    dan kalau "DoWhile" dia akan menjalankan bloknya (kodenya) minimal sekali terlebih dahulu, baru setelah itu dia memeriksa kondisinya,
    jika kondisinya true, maka ia akan kembali mengulang kode tersebut, namun jika kondisinya false maka ia tidak akan menjalankan kodenya lagi
     */

    var perulanganMinimalSekali = 0
    // Kode ini akan dijalankan terlebih dahulu, mau nanti hasilnya true ataupun false
    do {
        println("Perulangan yang ke $perulanganMinimalSekali")
        perulanganMinimalSekali++
    // Baru setelah kode diatas dijalankan, ia akan memeriksa apa kondisi dibawah ini? jika true maka ia akan menjalankan kode tersebut, jika false maka ia tidak akan menjalankan kode tersebut
    } while (perulanganMinimalSekali < 100)
}