fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return  total;
}

fun bagi(a: Int,b: Int): Int {
    if(b == 0) { // validasi value
        return  0
    } else {
        val total = a / b;
        return total;
    }
}

fun main() {
    val result = jumlahkan(10, 10);
    val result2 = bagi(10, 2); // dalam aritmatika jangan di bagi 0 maka pasti akan error tanpa validasi
    println(result)
    println(result2)
}