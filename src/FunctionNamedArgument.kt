fun fullName(
    firstName: String,
    middleName: String,
    lastName: String,
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Dimas", "Dimdevs", "Maulana")
    fullName(
        firstName = "Dimas",
        middleName = "Dimdevs",
        lastName = "Maulana",
    )
}