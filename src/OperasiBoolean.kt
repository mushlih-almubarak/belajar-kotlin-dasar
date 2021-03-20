fun main() {
    /* Ini adalah OperasiBoolen. True Tambah True (Kode: &&), False atau True (Kode: ||), True kebalikan True (kode: !). Sc: https //p rnt.sc/yul38s
     Dibawah ini adalah contoh kode untuk menentukan apakah seorang siswa lulus dari sekolahnya atau tidak
     */

    // Menampilkan nilai siswa pada sekolah
    val nilaiUjian = 80
    val nilaiAbsen = 83
    val nilaiEkstra = 55

    // Rumusnya:
    // Dikatakan lulus ujian jika nilai ujiannya lebih besar dari 75
    val apakahLulusUjian = nilaiUjian > 75
    // Dikatakan lulus absen jika nilai absennya lebih besar dari 75
    val apakahLulusAbsen = nilaiAbsen > 75
    // Dikatakan lulus ekstra jika nilai ekstranya lebih besar dari 50
    val apakahLulusExstra = nilaiEkstra > 50

    // Perhitungan nilai untuk menentukan kelulusan
    val apakahLulusSekolah = apakahLulusUjian && apakahLulusAbsen && apakahLulusExstra
    // val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra
    // val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra)

    println(apakahLulusSekolah)
}