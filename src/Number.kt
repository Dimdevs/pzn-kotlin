
fun main () {
    // Type Data Number

    //Number: Bulat
    var age: Int = 200;

    // Floating Point Number: pecahan
    var Sample: Float = 10.1F;

    // Literals
    var binary: Int = 0b010101010

    // Underscore
    var price: Long = 9_000_000_000L;

    // Conversion
    var priceInt: Int = price.toInt();
    var doubleBinary: Double = binary.toDouble();

    println(age); // 200
    println(Sample); // 10.1
    println(binary); // 170
    println(price); // 9000000000
    println(priceInt); // 410065408
    println(doubleBinary); // 170.0
}