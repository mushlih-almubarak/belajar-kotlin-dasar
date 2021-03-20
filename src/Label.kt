/* Label adalah penanda pada suatu baris kode
Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @
Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada,
namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti
 */

fun labelBreak() {
    perulangan@ for (perulanganAngka in 1..10) {
        perulanganA@ for (perulanganAngka2 in 1..10) {
            if (perulanganAngka > 5) {
                break@perulangan
            }
            println("$perulanganAngka * $perulanganAngka = ${perulanganAngka * perulanganAngka}")
        }
    }
}

fun labelContinue() {
    Ulang1@ for (Mengulangi in 1..10) {
        Ulang@ for (Mengulangi1 in 1..10) {
            if (Mengulangi1 == 5) {
                continue@Ulang1
            }
            println("$Mengulangi * $Mengulangi1 = ${Mengulangi * Mengulangi1}")
        }
    }
}

fun main() {

    fun tes(nama: String, oprasi: (String) -> Unit): Unit = oprasi(nama)

    tes("") percobaan@{
        if (it == "") {
            return@percobaan
        } else {
            println("Mushlih")
        }
    }

}