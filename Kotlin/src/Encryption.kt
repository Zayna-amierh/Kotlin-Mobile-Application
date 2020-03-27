fun main() {
    println("Enter your username: ")
    var userName = readLine()!!
    println("Enter your password: ")
    var password = readLine()!!
    if (userName !="Kotlin" && password !="IsFun") {
        println("Your username and password entered are incorrect")
    }
    else {
        println(
            "Enter what would you like to do: " +
                    "E: Encryption " +
                    "D: Decryption"
        )
        var choice = readLine()!!
        println("Enter the letter or number you would like to do the operation")
        var CodeVar = readLine()!!

        when (choice) {
            "E" -> {
                CodeVar.first().toInt()
                println("The Encrypted Value is $CodeVar")
            }
            "D" -> {
                var change = CodeVar.first().toInt()
                var dec = change.toChar()
                println("The Decrypted Value is $dec")
            }
        }
    }
}
