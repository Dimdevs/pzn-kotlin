fun main () {
    var Result = 10 / 3;
    // jika type data number maka hasil akan menjadi number bulat
    // bukan floating jika ingin mengahsilkan nilai floating maka di tambahkan .0
    println(Result)

    var ResultFloating = 10.0 / 3.0;
    println(ResultFloating);

    var ResultOperator = 10 + 10 / 2;
    // akan lebih mengutamakan *, /, dibanding dengan + dan -
    // menggunakan calculator sincetific
    println(ResultOperator);

    // Operasi Augmented Assignments
    var total: Int = 0
    val barang1 = 100;
    total += barang1;
    val barang2 = 200;
    total += barang2;
    val barang3 = 300;
    total += barang3;
    println(total);

    // Unery Operator
    total++
    total++
    total--
    println(total)

    val suhu = -5;
    println(suhu)

    val sehat = true;
    println(!sehat)
}