/* "Return If" berguna untuk mempersingkat penulisan
Jika  Kita tidak menggunkana "Return If", maka biasanya Kita harus menuliskan kode "return" terlebih dahulu
Jika Kita menggukanakan "Return If", maka Kita hanya perlu menuliskannya sekali
"Return When" juga sama seperti "Return If"
 */

fun tanpaReturnIf(nama:String = ""): String{
    if (nama == "") {
        return "Assalamualaikum Orang Tak Dikenal"
    }else{
        return "Assalamualaikum $nama"
    }
}

fun pakaiReturnIf(namaDepan:String = ""): String{
    return if (namaDepan == "") {
        "Assamualaikum Orang Tak Dikenal"
    }else{
        "Assalamualaikum $namaDepan"
    }
}

fun tanpaReturnWhen(Nama: String = ""): String {
    when (Nama) {
        "" -> return "Assalamualaikum Orang Tak Dikenal"
        else -> return "Assalamualaikum $Nama"
    }
}

fun pakaiReturnWhen(NamaDepan:String = ""):String{
    return when (NamaDepan){
        "" -> "Assalamualaikum Orang Tak Dikenal"
        else -> "Assalamualaikum $NamaDepan"
    }
}

    fun main() {
        println(tanpaReturnIf())
        println(tanpaReturnIf("Mushlih"))

        println(pakaiReturnIf())
        println(pakaiReturnIf("Mushlih"))



        println(tanpaReturnWhen())
        println(tanpaReturnWhen("Mushlih"))

        println(pakaiReturnWhen())
        println(pakaiReturnWhen("Mushlih"))
}