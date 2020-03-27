fun main(){
    var arr = arrayOf(2, 24, 90, 4, 8)
    println("This is the array")
    for(e in arr){
        print("$e ")
    }
    for(i in 0..arr.size-2){
        for(j in i+1..arr.size-1){
            if(arr[i] > arr[j]){
                var temporary = arr[i]
                arr[i] = arr[j]
                arr[j] = temporary
            }
        }
    }
    println("\nThe array when sorted:")
    for(e in arr){
        print("$e ")
    }
}