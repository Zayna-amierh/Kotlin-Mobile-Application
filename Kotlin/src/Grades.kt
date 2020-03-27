fun main() {
    var grade1 = 25
    var grade2 = 20
    var grade3 = 15
    var grade4 = 22
    var grade5 = 5

    grade1 *= 4
    grade2 *= 4
    grade3 *= 4
    grade4 *= 4
    grade5 *= 4

    var numOfFauilerClasses= 0
    if (grade1 < 50) {
        numOfFauilerClasses++
    }

    if (grade2 < 50) {
        numOfFauilerClasses++
    }

    if (grade3 < 50) {
        numOfFauilerClasses++
    }

    if (grade4 < 50) {
        numOfFauilerClasses++
    }

    if (grade5 < 50) {
        numOfFauilerClasses++
    }

    println("the number of failure classes is $numOfFauilerClasses")

    var sum = grade1 + grade2 + grade3 + grade4 + grade5
    println("The Sum of grades is $sum")

    var average = sum.div(5)
    println("The Average of the grades is $average")

    if (average >50 && average<75) {
        println("$average is Good Overall")
    } else if (average >= 75 && average <85){
        println("$average is Very Good")
    } else if( average >= 85) {
        println("$average is Excellent")
    } else {
        println("$average is Failure")
    }
}