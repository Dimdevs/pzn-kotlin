fun main() {
    var firstName: String = "Dimas";
    var lastName: String = "Maulana";
    // String Biasa

    var Address: String = """
        |Indonesia,
        |Jawa Barat,
        |Bogor,
        |Desa Girimulya,
    """.trimMargin();
    // String Multi + Trim

    var fullName: String = firstName + " " + lastName;
    // merge String

    var Desc: String = "Total $fullName char = ${fullName.length}"
    // string template

    println(firstName)
    println(lastName)
    println(Address)
    println(fullName)
    println(Desc)
}