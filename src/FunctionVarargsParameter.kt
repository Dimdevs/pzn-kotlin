import javax.naming.Name

// Berdasarkan Array
fun hitungTotalArray(values: Array<Int>): Int {
    var total = 0;
    for (value in values) {
        total += value;
    }
    return total;
}

// Berdasarkan Varargs
fun BerhitungVarargs(name: String, vararg values: Int): String {
    var total = 0;
    for (value in values) {
        total += value;
    }
    return "${name} $total";
}

fun main() {
    // Berdasarkan Array ditampung menjadi varargs
    val values = arrayOf(10,10,10,10);
    val result = hitungTotalArray(values);
    println(result);

    // Berdasarkan Varargs ditampung sebagai varargs juga
    val resultByVarargs = BerhitungVarargs("Dimas", 10, 20, 30, 40, 50, 60)
    println(resultByVarargs);
}