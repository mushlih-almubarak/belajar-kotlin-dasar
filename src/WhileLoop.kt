fun main() {

    /* While adalah salah satu perlungan di Kotlin, namun ia bukan seperti "Range" yang menghitung dari 0-100 jika kode "Range"nya 0.100
    Namun ia akan terus mengulang yang nilainya true, sampai nilai true tersebut habis dan berubah menjadi false
    HATI-HATI, JIKA TIDAK ADA YANG "FALSE" MAKA IA AKAN TRUS MENGULANG KODENYA TANPA PERNAH BERHENTI
     */

    // Setelah kata sama dengan (=) di perulanganSampaiFalse adalah nilai awal sebelum dia menghitungnya
    var perulanganSampaifalse = 0
    /* Apalah angka nol diatas lebih besar dari 10?
    Jika benar (true) maka ulang angka nol yang diatas sampai angkanya kurang satu dari 10, jika salah (false) maka tidak usah dijalankan kodenya karena sudah "false"
    Dan fitur "While" hanya akan mengulang jika ia benar (true)
     */
     while (perulanganSampaifalse < 100) {
         println("Perulangan $perulanganSampaifalse")
         // Tambahkan angka nol yang ada diatas 1 per-satu, jika kode dibawah tidak ditambahkan, maka hasilnya akan nol terus
         perulanganSampaifalse++
     }

    // Kode ini yang akan di cetak jika kode yang dijalankan diatas nilainya sudah menjadi false
    println("Perulangan Selesai")
}