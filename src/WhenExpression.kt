fun main() {
    // "WhenExspresion" sama saja dengan "IfExspresion", cuman ini lebih singkat
    val nilai = "C"

    when (nilai) {
        "A" -> println("Sangat Bagus")
        "B" -> println("Bagus")
        "C" -> println("Lumayan")
        "D" -> println("Buruk")
        "E" -> println("Sangat Buruk")
    }

    // Jika ingin mengucapkan "Selamat Anda Lulus" untuk yang mendapatkan nilai "A", "B", dan "C", gunakan koma setelah setiap nilai
    when (nilai) {
            // if(nilai == "A" || nilai == "B" || nilai == "C")
            "A", "B", "C" -> {
                println("Selamat Anda Lulus")
            }
            else -> {
                println("Maaf, Anda Tidak Lulus")
            }
        }


    // Untuk menyederhanakan kode yang diatas tadi, bisa juga menggunakan "Array"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        // Gunakan tanda "!" untuk kebalikannya, walaupun sebenarnya bisa juga menggubakan "else"
        !in nilaiLulus -> println("MAAF, ANDA TIDAK LULUS")
    }

    /* Untuk mengecek apa tipe data sebua variabel, apakah itu String, boolean, Int, dll.
    Maka gunakan kode "is tipeData", contoh "is String" itu artinya apakah tipe data tersebut String?
    Jawabannya hanya ia itu adalah string, atau tidak itu bu
     */

    // Kode ini hanya dapat menjawab "Itu adalah String" jika tipe datanya adalah String, tapi jika ia bukan String maka akan muncul error
    val cekTipeDataError = "Mushlih"
    when (cekTipeDataError) {
    is String -> println("Itu adalah String")
    !is String -> println("Itu bukan String")
    }

    // Gunakan kode "Any" pada kode dibawah ini agar tidak error jika ia bukan String
    val cekTipeData:Any = 8
    when (cekTipeData) {
        is String -> println("Itu adalah String")
        !is String -> println("Itu bukan String")
    }


    // When bisa digunakan untuk penggganti "IfElse", dan ia lebih simple juga
    val nilaiUjian = 95
    when {
        nilaiUjian > 90 -> println("Bagus")
        nilaiUjian > 80 -> println("Sedang")
        nilaiUjian > 70 -> println("Buruk")
        else -> println("Coba Lagi")
    }
}