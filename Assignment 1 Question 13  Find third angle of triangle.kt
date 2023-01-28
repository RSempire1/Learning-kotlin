fun main(){
    print("Please enter 1st angle of triangle:")
    val a= readLine()!!.toFloat()

    print("Please enter 2nd angle of triangle:")
    val b= readLine()!!.toFloat()

    val c=180-(a+b)

    print("Third angle is $c")


}