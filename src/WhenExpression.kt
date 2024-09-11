fun main() {
    // when expression only
    val Nilai = "E";
    when (Nilai) {
        "A" -> {
            println("Amazing");
        }
        "B" -> {
            println("Good Not Bad")
        };
        "C" -> {
            println("Not Bad");
        }
        else -> {
            println("Try Again Next Year");
        }
    }

    // when expression multiple option
    when(Nilai) {
        "A", "B", "C" -> {
            println("Selamat Anda LULUS !");
        }
        else -> {
            println("Maaf Anda Tidak LULUS !");
        }
    }

    // when expression In
    val nilaiArray: Array<String> = arrayOf("A", "B", "C");
    when(Nilai) {
        in nilaiArray -> println("SELAMAT ANDA LULUS !")
        !in nilaiArray -> println("MAAF ANDA TIDAK LULUS !")
    }

    // when expression Is
    val name = "Dimas";
    when(name) {
        is String -> println("Name Is String !")
        !is String -> println("Name Is Not String !")
    }

    // when expression if else
    val nilaiTerakhir = 80;
    when {
        nilaiTerakhir > 80 -> println("Ayam Jago")
        nilaiTerakhir > 70 -> println("Ayam Kate")
        nilaiTerakhir > 60 -> println("Ayam Kampus")
        else -> println("Lemah")
    }
}