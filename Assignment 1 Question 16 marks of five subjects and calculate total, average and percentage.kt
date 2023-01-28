fun main(){

    println("Please enter marks of all 5 subjects out of 100 for each subject")
    val a= readLine()!!.toFloat()
    val b= readLine()!!.toFloat()
    val c= readLine()!!.toFloat()
    val d= readLine()!!.toFloat()
    val e= readLine()!!.toFloat()

    val f=(a+b+c+d+e)/5
    val g=a+b+c+d+e
    val h=((a+b+c+d+e)/500)*100  //per subject marks assumed out of 100

    println("Average of marks is $f")
    println("Sum of all marks is $g")
    println("Percentage is $h")



}