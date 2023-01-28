import kotlin.math.sqrt

fun main(){

    println("Please Base of the equilateral triangle:")
    val a= readLine()!!.toFloat()

    val b=0.5*a*0.5*sqrt(3.0)*a

    print("Value of the equilateral Triangle is:$b")
}