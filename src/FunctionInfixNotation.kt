/*
PENGERTIAN INFIX NOTATION
-   "Infix Notation" adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
-   Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)

SYARAT INFiX NOTATION
-   Harus sebagai function member (akan dibahas di OOP) atau function extension
-   Harus memiliki 1 parameter
-   Parameter tidak boleh varargs dan tidak boleh memiliki nilai default

Untuk menggunakan "Infix Notation", gunakan kode "infix" di awal
*/

// Kode dibawah ini adalah untuk menjadikan huruf menjadi huruf besar semua, atau sebaliknya, jika syarat-syaratnya terpenuhi


//String adalah tipe datannya
infix fun String.ke(besar: String): String {
    if (besar == "HURUFBESAR") {
        //"UpperCase" adalah huruf besar, "toUpperCase" adalah kode, dan bukan yang kita buat sendiri
        return this.toUpperCase()
    } else {
        //"LowerCase" adalah huruf kecil, "toLowerCase" adalah kode, dan bukan yang kita buat sendiri
        return this.toLowerCase()
    }
}


fun main() {
    val hurufBesar = "Mushlih Almubarak" ke "HURUFBESAR"
    println(hurufBesar)
    val hurufKecil = "Mushlih Almubarak" ke "Huruf Kecil"
    println(hurufKecil)
}