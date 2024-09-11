fun main() {
    // presentasi array

    // val array bisa mengubah data di dalam nya bukan variabelnya
    val name: Array<String> = arrayOf("Dimas" , "audrey", "Ipeh");

    val nilai: Array<Number> = arrayOf(10, 8, 7);

    val switching: Array<String?> = arrayOfNulls(5);
    switching[0] = "Dimas";
    switching[1] = "Farhan";
    switching[2] = null;
    switching[4] = "Hollo";

    // Operasi Array
    // size

    // get(index)
    // example : println(name.get(1))

    // [index]
    // example : println(name[0])

    // set(index, value)
    // saat mengganti nilai tidak boleh mengganti dengan nilai null, kecuali pada array memiliki <String?> = arrayOfNulls();
    // example : name.set(1, "Udin")

    // [index] = index

    println(name[0])
    println(nilai[0])
    println(switching.size);
}