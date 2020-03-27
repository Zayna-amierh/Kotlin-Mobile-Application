fun main() {
    println("Enter the number you would like to find the prime numbers from 1 to it: ")
    var num = readLine()!!.toInt()
    for (i in 2..num) {
        var p = 1
        var k = 2
        while (k < i) {
            if (i % k == 0) {
                p = 0
                break
            }
            k++
        }
        if (p == 1) {
            print("$i, ")
        }
    }
}