fun main() {
    println("enter your username: ")
    var userName = readLine()!!
    println("enter your password: ")
    var password = readLine()!!
    var checkUserName = CheckUserName(userName)
    var checkPassword = CheckPassword(password)

    if (checkUserName=="2kotlin2" && checkPassword=="aaFUNbb") {
        println("You are authorized!")
    } else {
        println("You are not authorized!")
    }
}

fun CheckUserName(userName: String): String{
    var resultant = "2" + userName + "2"
    if (resultant == "2kotlin2") {
        println("Ok")
    }
    else {
        println("No")
    }
    return resultant
}

fun CheckPassword(password: String): String{
    var result = password.replace("fun".toRegex(), "FUN")
    if (password.contains("fun")) {
        if (result == "aaFUNbb") {
            println("Ok")
        } else {
            println("No")
        }
    }
    else {
        println("No")
    }
    return result
}

