/* "Single Expression Function" digunakan untuk menulis function yang memiliki kode hanya sebaris
Dari pada membuat kodenya adalah dengan menuliskan sama dengan (=) setelah tanda kurung
Tidak perlu menuliskan tanda {} setelah tanda kurung
Fitur ini digunakan untuk menyederhanakan baris kode
 */
fun halo(){
    println("Assalamualaikum Mushlih")
}

fun haloo() = println("Assalamualaikum Mushlih")

fun namaLengkap(namaDepan:String, namaBelakang:String, alamat:String, umur:Int,) {
    println("Assalamualaikum, nama saya $namaDepan $namaBelakang, saya tinggal di $alamat, umur saya $umur tahun")
}

fun namaLengkapp(namaBelakangg: String, alamatt: String, umurr: Int, namaDepann: String) = println("Assalamualaikum, nama saya $namaDepann $namaBelakangg, saya tinggal di $alamatt, umur saya $umurr tahun")

fun main() {
    halo()
    haloo()
    namaLengkap("Mushlih", "Almubarak", "Riyadh", 16)
    namaLengkapp(namaDepann = "Mushlih", namaBelakangg = "Almubarak", alamatt = "Riyadh", umurr = 16)
}