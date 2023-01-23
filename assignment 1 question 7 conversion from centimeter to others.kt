fun main(){

    println("Please enter centimeters:")
    val centimeter=readLine()!!.toInt()

    val meter=centimeter/100

    println("$meter is the meter value")

    val kilometer=centimeter/100000

    println("$kilometer is the value in kilometers")
}