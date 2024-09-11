fun main() {
    var array: Array<String> = arrayOf(
        "Dimas",
        "audrey",
        "Ipeh",
        "Manda",
        "Ai"
    )

    // For Array
    var total = 0;
    for (name in array) {
        println(name)
        total++
    }

    // For Range
    for (i in 0..100 step 2) {
        println("normaly : $i")
    }

    for (i in 1 downTo  200 step 2) {
        println("down to : $i")
    }

    val ukuranArray = array.size - 1;
    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }

    println("Total Perulangan = $total");
}