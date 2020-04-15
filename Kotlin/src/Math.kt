class Sum {
    val x = 3;
    fun sumN(num1: Int, num2: Int): Int{
        return num1 + num2 + x
    }
}

class Div {
    val y = 2;
    fun divN(num1: Int, num2: Int): Int {
        if (num1!=0 && num2!=0){
            return num1/num2
        }
        else {
            return 0
        }
    }
}

class Mult {
    var arr = arrayOf(2, 4, 7, 5, 8)
    fun multN(num1: Int, num2: Int, num3: Int): Int {
        return num1 * num2 * arr[num3]
    }
}

class Sub {
    var arr = arrayOf(3, 9, 6, 10, 1)
    fun subM(num1: Int, num2: Int, num3: Int): Int {
        return num1 - num2 - arr[num3]
    }
}

fun main(){
    var sum = Sum()
    var div = Div()
    var mult = Mult()
    var sub = Sub()

    println(sum.sumN(3, 4))
    println(div.divN(6,2))
    println(mult.multN(2, 3, 3))
    println(sub.subM(10, 5, 3))


}