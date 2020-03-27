fun main(){
    var arrint = Array(5){0}
    var count = 0
    var sum = 0
    var q = 0
    for(i in arrint.indices){
        arrint[i] = readLine()!!.toInt()
        if(arrint[i] % 3 == 0){
            count++
        }
        if(i % 2 == 0){
            sum += arrint[i]
            q++
        }
    }
    var average = sum/q
    println("The number of integers which are divisible by 3 is $count")
    println("The average of integers in even indexes is $average")

}