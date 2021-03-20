fun main() {
    // Tipe data "String" untuk mencetak kata setelahnya
    var namaDepan: String = "Mushilh"
    var namaBelakang: String = "Almubarak"

    /* Gunakan tanda "|" atau ">" agar tidak terjadi spasi pada alamat yang di cetak
    Tambahkan kode .trimMargin() dibawah (setelah) kata "|" atau ">"
    jika menggunakan tanda ">" maka harus menambahkan kode ">" didalam kurung setelah kata .trimMargin()
    Namun jika menggunakan kode "|" maka tidak perlu menambahkan kode ">" didalam kurung setelah kata .trimMargin()
    */

    // Gunakan tanda """ awal dan """ diakhir untuk mencetak string yang memiliki banyak baris (string yang bukan 1 baris)
    var alamat: String = """
    >Jalan sudirman,
    >Riyadh,
    >Saudi Arabia
    """.trimMargin(">")

    println(namaDepan)
    println(namaBelakang)
    println(alamat)

    // Gunakan tanda " " untuk menambahkan spasi pada string yang digabungkan, namun cara ini sudah lama
    var namaLengkapCaraLama: String = namaDepan + " " + namaBelakang
    println(namaLengkapCaraLama)

    // Sebagai gantinya, gunakan tanda "$" untuk menambahkan spasi pada string yang digabungkan, dan ini adalah cara terbaru
    var namaLengkapCaraBaru: String = "$namaDepan $namaBelakang"
    println(namaLengkapCaraBaru)

    // Tambahkan kode .length untuk mencetak berapa huruf yang ada pada nilai tersebut (Dia akan menghitung termasuk spasi diantara nilai tersebut)
    var HitungKarakternamaLengkap: String = "$namaDepan $namaBelakang"
    println(HitungKarakternamaLengkap.length)
}