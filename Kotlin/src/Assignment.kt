class Number1 {
    var arr = arrayOf(1, 3, 16, 12, 4, 5, 13, 4, 10, 7)

    fun PickNumber(i: Int): Int {
        var number = arr.get(i)
        return number
    }
}

class Operation {
    var opp = arrayOf("+", "-", "*", "/")

    fun PickOperation(i: Int): String {
        var n = i%4
        var operation = opp.get(n)
        return operation
    }
}

class Number2 {
    var arr2 = arrayOf(1, 4, 7, 12, 19, 6, 10, 11, 2, 20)

    fun PickNumber(i: Int): Int {
        var n2 = (10-(i+1))
        var number2 = arr2.get(n2)
        return number2
    }

}
fun main() {
    var N1 = Number1()
    var operator = Operation()
    var N2 = Number2()
    var count = 0
    var result: Int = 0
    for(i in 0 until 10){
        var first = N1.PickNumber(i)
        var operation = operator.PickOperation(i)
        var second = N2.PickNumber(i)

        println("The Question is: $first $operation $second")
        println("Enter your result:")
        var userAnswer = readLine()!!.toInt()
        when(operation){
            "+" -> result = first + second
            "-" -> result = first - second
            "*" -> result = first * second
            "/" -> result = first/second
        }
        if(userAnswer == result){
            println("Correct..Next")
            count++
        }else{
            println("Wrong..Next")
        }
    }
    println("The number of correct answers solved by you is $count")
}


