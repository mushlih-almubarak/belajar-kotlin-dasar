fun main() {

    /* "Break" adalah cara untuk menghentikan semua perulangan,
    Jika suatu kode tidak akan ada falsenya, maka cara menghentikan pengulangannya adalah menggunakan break
    Karena jika tidak ada yang "false" hasilnya maka perulangannya akan jalan trus, untuk menghentikannya menggunakan "break"
     */

    var stopSemuaPerulanganMenggunakanBreak = 0

    // Kata "true" didalam kurung bukanlah nama yang Kita buat, tapi memang itu kodenya jika ingin hasilnya "true" terus
    while (true) {
        println("Assalamualaikum yang ke $stopSemuaPerulanganMenggunakanBreak")
        stopSemuaPerulanganMenggunakanBreak++

        // Jika kode dibawah ini tidak ditambahkan, maka ia hanya akan mencetak 1 kata, yaitu "Assalamualaikum yang ke 0"
        if (stopSemuaPerulanganMenggunakanBreak > 100)
        // Kode ini adalah untuk menghentikan perulangan yang ada di atas
            break
    }

    /* "Continue" dugunakan untuk menstop atau melewati suatu kode agar tidak dijalankan
    Misal jika ingin mencetak semua angka dari 1-100, namun hanya ingin mencetak angka ganjil
    Maka gunakan "Continue", yang gunanya akan melewati (men-Continue) semua angka genap
     */

    var stopSebagianPerulangan = 0

    for (stopSebagianPerulangan in 0..100) {

        /* Maksudnya kode dibawah ini adalah, jika angka yang ada di "stopSebagianPerulangan" akan habis jika dibagi 2 trus (berarti angka yang genap),
        maka angka yang seperti itu (angka genap) tidak usah di cetak, di lewati (Continue) saja */
        if (stopSebagianPerulangan % 2 == 0) {
            continue
        }
        println("Angka ke $stopSebagianPerulangan")
    }
}