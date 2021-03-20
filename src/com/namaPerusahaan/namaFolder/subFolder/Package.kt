/* Package adalah cara untuk mengelompokkan beberapa file Kotlin dalam satu folder
Untuk membuat package/folder, gunakan "namaDomain.namaPerusahaan.namaFolder"
Untuk membuat sub folder, gunakan tanda titik (.) setelah nama folder, contoh "namaDomain.namaPerusahaan.namaFolder.namaSubFolder"
Penamaan package biasanya menggunakan huruf kecil semua
 */

package com.namaPerusahaan.namaFolder.subFolder

fun sapaan(nama:String) {
    println("Assalamualaikum $nama")
}

fun umur(umur:Int){
    println("Umur saya $umur")
}
