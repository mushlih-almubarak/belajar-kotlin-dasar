fun main() {

    /* Ini adalah operasai perbandingan (Lebih dari), (kurang dari), dll: https //p rnt.sc/ypt9rx
    Ia menggunakan tipe data boolean, jadi hasilnya hanya "True" (Benar), atau "False" (Salah)
     */

    val a = 100
    val b = 200

    // Apakah "A" lebih besar dari "B"?
    val hasil: Boolean = a > b
    println(hasil)

    // Bisa juga membadingkannya menggunakan cara ini:
    println(a > b)
    // Atau bisa langsung seperti ini:
    println(100 > 200)

    println(100 >= 100)
    println(100 <= 100)

    // Operasi perbandingan tidak hanya untuk angka, bisa juga untuk string, jadi dia akan membandingkan dengan cara melihat huruf mana yang duluan (a,b,c,d,e,sampai z)
    println("a" < "b")
    println("a" > "b")
    println("Mushlih" < "Mushlih")
    println("Mushlih" <= "Mushlih")
    // Atau bisa juga menggunakan sama dengan (=) tetapi sama dengannya 2 kali (==). Maksud dibawah ini adalah a sama dengan a
    println("a" == "a")
    // Atau bisa juga menggunakan tanda seru (!) kemudian sama dengan (=) tetapi sama dengannya cukup 1 kali (=). Maksud dibawah ini adalah a TIDAK sama dengan a
    println("a" != "a")
}