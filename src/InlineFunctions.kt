/*
Penggunaan "Higher-Order Function" akan berdampak terhadap performa saat aplikasi berjalan, karena harus membuat object lambda berulang-ulang.
Jika penggunaannya tidak terlalu banyak mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
Inline Functions adalah kemampuan di Kotlin yang mengubah "Higher-Order Function" menjadi "Inline Function"
Dimana dengan "Inline Function", kode di dalam "Higher-Order Function" akan di duplicate agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang
Tambahkan kode "Inline" untuk menggunakan fitur tersebur, dan gunakan kode "noinline" jika ingin sebagian kodenya di "inline", dan sebaginnya lagi tidak di "inline"
Jadi fitur ini gunanya untuk mempercepat aplikasi yang kita buat
Perbedaan menggunakan fitur "Inline" dan saat tidak menggunakan fitur tersebut dapat dilahat dari Kotlin "Bytcode"nya, kemudian klik "Decompile"
 */

inline fun sapa(
        namaDepan: () -> String,
noinline namaBelakang: () -> String
): String {
    return "Assalamualaikum ${namaDepan()} ${namaBelakang()}"
}

fun main() {
    for (duplikatNama in 0..10){
        println(sapa({"Mushlih"}, {"Almubarak"}))
    }
}