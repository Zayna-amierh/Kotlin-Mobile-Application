fun main() {
    println("Assignment(1):")
    println("Please enter your first number (should be larger than the second): ")
    var U = readLine()!!.toInt()
    println("Please enter your second number (should be less than the first: ")
    var V = readLine()!!.toInt()
    var gcd = 1
    var i = 1
    while (i <= U && i <= V) {
        if (U % i == 0 && V % i == 0)
            gcd = i
        ++i
    }
    println("G.C.D of $U and $V is $gcd")

}