fun main(){

    println("Please enter base of the triangle:")
    val base= readLine()!!.toFloat()

    println("Please enter height of triangle:")
    val height= readLine()!!.toFloat()

    val area=0.5*base*height

    print("Area of triangle is: $area")
}