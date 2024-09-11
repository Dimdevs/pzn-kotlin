fun Hello(firstName: String, lastName: String = "") {
    if(lastName == null) {
        println("Hello : $firstName")
    } else {
        println("Hello : $firstName $lastName")
    }
}

fun main() {
    Hello("Noname");
    Hello("aku" , "kamu");
}