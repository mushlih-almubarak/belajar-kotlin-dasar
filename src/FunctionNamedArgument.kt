/* "Function Named Argument" berguna untuk bisa menuliskan isi dalam parameter secara acak, tidak harus berurutan
Misal, parameter pertama, "nama", kedua "alamat", maka kita tidak harus menuliskan data "nama" dahulu kemudian "alamat" tapi boleh tulis "alamat" dulu setelah itu "nama"
Cara menggunakannya adalah dengan menuliskan (namaParameter = "isiParameter"), Kalau yang biasanya kan hanya menuliskan ("Isi parameter")
Menuliskannya tidak boleh dicampur, misal sebagian menggunakan Function Named Argument, dan sebagian lagi seperti biasa (tidak menggunakan Function Named Argument)
 */

fun dataAcak(alamat: String, namaDepan: String, sekolah: String, namaTengah:String = "", namaBelakang: String, umur: Int) {

    if (namaTengah == "") {
        println("Nama saya $namaDepan $namaBelakang, umur $umur tahun, tinggal di $alamat, sekolah di $sekolah ")
    } else {
        println("Nama saya $namaDepan $namaTengah $namaBelakang, umur $umur tahun, tinggal di $alamat, sekolah di $sekolah")
    }
}

// Menuliskan parameter dan isi parameternya boleh ditulis sebaris menggunakan koma, dan boleh juga ditulis menggunakan enter, namun komanya tetap ditulis
fun dataAcakEnter(alamat: String,
                  namaTengah:String = "",
                  namaBelakang: String,
                  namaDepan: String,
                  sekolah: String,
                  umur: Int){

    if (namaTengah == "") {
        println("Nama saya $namaDepan $namaBelakang, umur $umur tahun, tinggal di $alamat, sekolah di $sekolah ")
    } else {
        println("Nama saya $namaDepan $namaTengah $namaBelakang, umur $umur tahun, tinggal di $alamat, sekolah di $sekolah")
    }
}


fun main() {
    dataAcak(namaDepan = "Mushlih", namaBelakang = "Almubarak", alamat = "Riyadh", umur = 16, sekolah = "Ma'had Ilmi")

    dataAcakEnter(namaDepan = "Muhammad",
        umur = 16,
        sekolah = "Ma'had Ilmi",
        namaBelakang = "Almubarak",
        alamat = "Riyadh",
        namaTengah = "Mushlih")
}