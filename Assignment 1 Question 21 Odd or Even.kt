fun main() {

print("Please enter a number:")
    var a = readLine()!!.toInt()
    if (a % 2 == 1) {
        println("$a is odd")

    } else {

        println("$a is even")
    }
}