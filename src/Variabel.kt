const val APP = "Belajar Kotlin Bersama"
const val VERSION = "0.0.1"
// Constant

fun main() {
    var firstName = "Dimas";
    // mutable
    firstName = "Maulana";

    val age = 30;
    // Immutable

    var name: String? = "Audrey";
    name = "Kiky";
    // Nullable -> tidak terlalu di rekomendasikan

    println("$APP : $VERSION");
    // Constant

    println(firstName);
    println(age);
    println(name)
    println(name?.length)
}