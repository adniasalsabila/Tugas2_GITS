fun main() {
    var angka: Int
    println("Menentukan Bilangan Ganjil dan Genap")

    print("Masukkan angka = ")
    angka = readLine()!!.toInt()
    if (angka % 2 == 0) {
        print("Angka $angka termasuk Bilangan Genap")
    } else {
        print("Angka $angka termasuk Bilangan Ganjilap")
    }
}
