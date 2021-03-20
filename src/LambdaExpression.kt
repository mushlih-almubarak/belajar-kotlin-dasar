/*Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
Lambda expression secara sederhana adalah function yang tidak memiliki nama
Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya
 */

fun buatLambdaDariLuar(alamat:String):String = alamat.toUpperCase()

fun main() {
    // val namaFunction: (tipeData) -> returnTipeDatanya = {Parameternya ->
    val contohLambdaa: (String, String) -> String = {namaDepan:String, namaBelakang:String ->
        val namaLengkap = "$namaDepan $namaBelakang"
        // Tidak perlu menggunakan kode return lagi
        namaLengkap
    }
    val namaLengkapp = contohLambdaa("Mushlih", "Almubarak")
    println(namaLengkapp)

    // Kode "it" digunakan jika Kita hanya menulis 1 parameter, jadi Kita boleh tidak menulis nama parameternya setelah tanda "{", dan akan digantikan menggunakan parameter "it"
    val lambdaPakaiIt: (String) -> String = {
        "Assalamualaikum $it"
    }
    println(lambdaPakaiIt("Mushlih"))

    // Jika Kita ingin membuat lambda dari function yang sudah ada diluar, maka Kita bisa menggunakan "Method References", gunakan kode titik dua (::) untuk menggunakannya
    val hurufBesar : (String) -> String = ::buatLambdaDariLuar //Tidak perlu tanda kurung lagi
    println(buatLambdaDariLuar("Riyadh"))
}