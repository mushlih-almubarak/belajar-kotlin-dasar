/* "Higher-Order Function" adalah function yang menggunakan function sebagai parameter atau mengembalikan function
Higher-Order Function berguna ketika ingin membuat function yang general dan ingin mendapatkan input yang flexible beruba lambda,
yang bisa dideklarasikan oleh si user ketika memanggil function tersebut
*/

// fun namaFun(parameter: tipeData, lambda): returnNilainya
fun namaHurufKapital(Nama:String, ubahHuruf:(String) -> String): String{
    val kapitalkanNama = ubahHuruf(Nama)
    return "Assalamualaikum $kapitalkanNama"
}

fun main() {
    // Untuk mencetaknya bisa menggunakan cara ini
    val lamdaHurufBesar = {nama: String -> nama.toUpperCase()}
    println(namaHurufKapital("Mushlih", lamdaHurufBesar))

    // Atau bisa juga mencetaknya cara ini, yang lebih singkat (Lambdanya langsung dimasukkan ketika di println)
    println(namaHurufKapital("Mushlih", {lambdaHurufKecil: String -> lambdaHurufKecil.toLowerCase()}))

    // Jika parameter lambdanya ada di terakhir, maka Kita bisa menggunakan fitur "Trailer Lambda" agar lebih mudah dibaca
    val fiturTrailerLambda = namaHurufKapital("Mushlih") {lambdaHurufBesar: String ->
        lambdaHurufBesar.toUpperCase()
    }
    println(fiturTrailerLambda)
}