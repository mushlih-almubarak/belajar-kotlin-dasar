/* Secara standar, file Kotlin hanya bisa mengakses function Kotlin lainnya yang berada dalam package yang sama
Jika kita ingin mengakses file Kotlin yang berada di package yang berbeda, maka kita bisa menggunakan "Import"
Saat melakukan import, kita bisa memilih ingin mengimport function tertentu, atau semua function yang ada pada package tersebut
 */
import com.namaPerusahaan.namaFolder.subFolder.sapaan
// Atau bisa juga menggunakan tanda bintang (*) untuk mengimpor semuanya
import com.namaPerusahaan.namaFolder.subfolder2.*
import com.namaPerusahaan.namaFolder.subFolder.umur
import com.namaPerusahaan.namaFolder.subfolder2.alamat
import com.namaPerusahaan.namaFolder.subfolder2.kelas

fun main() {
    sapaan("Mushlih")
    umur(16)
    alamat("Riyadh")
    kelas(3,"SMP")
}