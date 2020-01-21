import java.lang.Math.abs

fun main() {

}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var i: Int = 0
    var j: Int = 0
    var sum: Int = 0;
    var sumLeft: Int = 0;
    for (i in 0 until arr[0].size - 1) {

        for (j in 0 until arr[0].size - 1) {
            if (i == j) {
                sum += arr[i][j]
            }
            if (i + j == (arr[0].size - 1)) {
                sumLeft += arr[i][j]
            }
        }
    }
    return sum + sumLeft
}

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    var minValue: Int = arr[0]
    var maxValue: Int = arr[0]
    for (value in arr) {
        if (value < minValue) {
            minValue = value
        }
        if (value > maxValue) {
            maxValue = value
        }
    }
   var sumValues = arr.reduce { a, b -> a + b }
    var minValues = sumValues - maxValue
    var maxValues = sumValues - minValue
    println("$minValues $maxValues")
}
// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {


}