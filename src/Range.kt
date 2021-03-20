fun main() {

    /* Ini adalah "Range"
    Range adalah cara untuk membuat array yang berisi data yang angka berurutan
    Cara membuat "Range" di Kotlin cukup menggunakan tanda .. (titik dua kali) agar angka tersebut urutannya dari bawah ke atas, dan gunakan "downTo" agar angkanya dari atas ke bawah (Terbalik)
    Operasi Range: https //p rnt.sc/xx5xkc
     */

    // Gunakan " .. (titik-titik)" untuk mencetak angkanya dari bawah ke atas
    val AngkaBerurutanDariBawahKeAtas = 0..1000
    println(AngkaBerurutanDariBawahKeAtas)

    //Gunakan operasi .count() untuk mengitung ada berapa angka di Range tersebut
    println(AngkaBerurutanDariBawahKeAtas.count())

    //Gunakan operasi .contains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariBawahKeAtas.contains(500))

    //Gunakan operasi .countains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariBawahKeAtas.contains(2000))

    //Gunakan operasi .first untuk melihat angka berapa di awal Range tersebut
    println(AngkaBerurutanDariBawahKeAtas.first)

    //Gunakan operasi .last() untuk melihat angka berapa di akhir Range tersebut
    println(AngkaBerurutanDariBawahKeAtas.last)

    //Gunakan operasi .step() untuk melihat berapa kenaikan pada setiap angka
    println(AngkaBerurutanDariBawahKeAtas.step)




    // Gunakan "downTo" untuk mencetak angkanya dari atas ke bawah (terbalik)
    val AngkaBerurutanDariAtasKeBawah = 1000 downTo 0

    //Gunakan operasi .count() untuk mengitung ada berapa angka di Range tersebut
    println(AngkaBerurutanDariAtasKeBawah.count())

    //Gunakan operasi .contains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariAtasKeBawah.contains(500))

    //Gunakan operasi .countains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariAtasKeBawah.contains(2000))

    //Gunakan operasi .first untuk melihat angka berapa di awal Range tersebut
    println(AngkaBerurutanDariAtasKeBawah.first)

    //Gunakan operasi .last() untuk melihat angka berapa di akhir Range tersebut
    println(AngkaBerurutanDariAtasKeBawah.last)

    //Gunakan operasi .step() untuk melihat berapa kenaikan pada setiap angka
    println(AngkaBerurutanDariAtasKeBawah.step)


    /* Gunakan kode "step 5" (angka 5 hanyalah contah) untuk menghitung angkanya dengan kelipatan 5 (5 hanya contoh)
    Dan juga sama untuk angka yang dari atas ke bawah, gunakan "step 5" (angka 5 hanyalah contah) untuk menghitung kelipatan 5 dari atas ke bawah (5 hanya contoh)
     */

    // Gunakan "step 5" untuk menghitung angkanya dengan kelipatan 5
    val AngkaBerurutanDariBawahKeAtasKelipatanLima = 0..1000 step 5
    //Gunakan operasi .count() untuk mengitung ada berapa angka di Range tersebut
    println(AngkaBerurutanDariBawahKeAtasKelipatanLima.count())

    //Gunakan operasi .contains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariBawahKeAtasKelipatanLima.contains(500))

    //Gunakan operasi .countains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariBawahKeAtasKelipatanLima.contains(2000))

    //Gunakan operasi .first untuk melihat angka berapa di awal Range tersebut
    println(AngkaBerurutanDariBawahKeAtasKelipatanLima.first)

    //Gunakan operasi .last() untuk melihat angka berapa di akhir Range tersebut
    println(AngkaBerurutanDariBawahKeAtasKelipatanLima.last)

    //Gunakan operasi .step() untuk melihat berapa kenaikan pada setiap angka
    println(AngkaBerurutanDariBawahKeAtasKelipatanLima.step)


    // Gunakan "step 5" untuk menghitung kelipatan 5 dari atas ke bawah
    val AngkaBerurutanDariAtasKeBawahKelipatanLima = 1000 downTo 0 step 5
    //Gunakan operasi .count() untuk mengitung ada berapa angka di Range tersebut
    println(AngkaBerurutanDariAtasKeBawahKelipatanLima.count())

    //Gunakan operasi .contains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariAtasKeBawahKelipatanLima.contains(500))

    //Gunakan operasi .countains(angkayangingindicari) untuk mencari apakah ada angka segitu di Range tersebut
    println(AngkaBerurutanDariAtasKeBawahKelipatanLima.contains(2000))

    //Gunakan operasi .first untuk melihat angka berapa di awal Range tersebut
    println(AngkaBerurutanDariAtasKeBawahKelipatanLima.first)

    //Gunakan operasi .last() untuk melihat angka berapa di akhir Range tersebut
    println(AngkaBerurutanDariAtasKeBawahKelipatanLima.last)

    //Gunakan operasi .step() untuk melihat berapa kenaikan pada setiap angka
    println(AngkaBerurutanDariAtasKeBawahKelipatanLima.step)

}