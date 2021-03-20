fun main() {

    // Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama

    /*
    Setelah kata "Array" yang ada di dalam kurung tajam <> itu adalah tipe datanya, tidak harus "String", bisa "Byte", "Int" dll
    Gunakan "arrayOf" kemudian setelah itu isikan kumpulan datanya
     */
    val nama: Array<String> = arrayOf("Mushlih", "Syakira", "Hadziq")

    // Untuk mengubah datanya, gunakan namaNilai.set(index, "UbahKeNamaIni")
    nama.set(0, "Budi")

    // Jika Kita mencetak kode "Array" seperti biasa Menggunakan "println(namaValue)", maka Kita tidak akan bisa membaca kode yang tersetak tersebut
    println(nama)
    /* Oleh karena itu, Kita harus menggunakan yang namanya "index" agar bisa membaca/mendapatkan kumpulan data tersebut.
    Lihat: https //p rnt.sc/xus4qm dan https //p rnt.sc/xus53m
     */
    println(nama[0])


    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    /* Untuk membuat "Array" yang bisa "null" gunakan tanda ? (tanda tanya) setelah tipe datanya
    Dan juga gunakan sintaks "arrayOfNulls, bukan "arrayOf", kemudian diisi dengan berapa jumlah datanya
     */
    val anggota: Array<String?> = arrayOfNulls(5)
    anggota[0] = "Mushlih"
    anggota[1] = "Budi"
    anggota[2] = "Ahmad"
    anggota[3] = "Hadziq"
    anggota[4] = "Mushab"
    println(anggota[0])
    println(anggota[1])
    println(anggota[2])
    println(anggota[3])
    println(anggota[4])

    // Gunakan sintaks .forEac untuk mencetak semua data di array tanpa ngetik satu per-satu indeksnya
    anggota.forEach {System.out.println(it)}
}