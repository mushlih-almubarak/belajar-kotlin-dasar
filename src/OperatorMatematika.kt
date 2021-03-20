fun main() {
    // Hasil di bawah ini adalah 3, bukan 3.3333333333333335 karena oprasi dibawah ini menggunakan "Int", dan int tidak mendukung koma (kayaknya)
    val HasilIntPembagian = 10 / 3
    println(HasilIntPembagian)

    // Jika ingin hasilnya menggunakan koma, maka tambahkan titik kemudian angkan 0 setelahnya, karena itu akan otomatis menggunakan "Double", dan double mendukung koma (kayaknya)
    val HasilDoublePembagian = 10.0 / 3.0
    println(HasilDoublePembagian)

    val HasilPertambahanPembagian = 10 + 10 / 2
    println(HasilPertambahanPembagian)

    // Cara menjumlahkan barang atau variable
    // Angka setelah "Int =" adalah angka total saat ini (sebelum dijumlahkan dengan harga barang lainnya), lalu angka total saat ini tersebut di jumlahkan dengan harga barang yang ada di bawahnya
    var TotalCaraLama: Int = 0

    /* 3 Kode dibawah ini setelah kata yang berawalan "val" adalah nama kemudian harga barangnnya
    Dan dibawah harga dan barang tersebut itu adalah cara untuk menjumlahkan total harga saat ini dengan harga barang yang dibeli
     */
    val sepatu = 100
    TotalCaraLama = TotalCaraLama + sepatu

    val iphone = 200
    TotalCaraLama = TotalCaraLama + iphone

    val meja = 300
    TotalCaraLama = TotalCaraLama + meja

    // Mencetak semua harga dari barang yang dibelinya
    println(TotalCaraLama)

    // Cara menjumlahkan harga barang diatas adalah cara yang lebih lama, ada juga cara yang lebih singkat tanpa menuliskan nilai "total"nya yaitu menggunakan "Augmented Assignments": https //p rnt.sc/xz7054
    var TotalCaraBaru: Int = 0
    val ayam = 100
    TotalCaraBaru += ayam

    val ikan = 200
    TotalCaraBaru += ikan

    val sapi = 300
    TotalCaraBaru += sapi

    println(TotalCaraBaru)

    // Untuk menambahkan atau mengurangi satu biaya pada harga tersebut, gunakan "Unary Operator" https //p rnt.sc/xz7l0x
    TotalCaraBaru++ // TotalCaraBaru = TotalCaraBaru + 1
    TotalCaraBaru++ // TotalCaraBaru = TotalCaraBaru + 1
    TotalCaraBaru++ // TotalCaraBaru = TotalCaraBaru + 1
    TotalCaraBaru-- // TotalCaraBaru = TotalCaraBaru + 1
    TotalCaraBaru-- // TotalCaraBaru = TotalCaraBaru + 1
    println(TotalCaraBaru)

    /* Untuk membuat oprasinya minus, gunakan tanda "-"
    Untuk membuat oprasinya plus, tidak usah digunakan tanda apapun, karena memang deafultnya adalah plus
     */
    val suhu = -5
    println(suhu)

    // Untuk membalikkan suatu nilai (misal yang benar menjadi salah), gunakan tanda "!" pada awal sebelum nilai saat mem-print
    val sayarobot = true
    println(!sayarobot)
}