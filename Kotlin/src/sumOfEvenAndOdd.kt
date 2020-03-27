fun main(){
    println("Assignment(2):")
    println("Instructions: enter 3 integers from minimum to maximum")
    println("Enter the first number: ")
    var n1 = readLine()!!.toInt()
    println("Enter the second number: ")
    var n2 = readLine()!!.toInt()
    println("Enter the third number: ")
    var n3 = readLine()!!.toInt()
    var i = 1
    var sum = 0
    var summation = 0
    var z = 1
    for(i in n1..n2){
        if (i % 2 == 0) {
        sum+=i
        }
    }
    for (z in n2..n3){
        if (z%2!==0){
            summation+=z
        }
    }
    println("The Sum of Even Numbers is $sum")
    println("The Sum of Odd Numbers is $summation")


}