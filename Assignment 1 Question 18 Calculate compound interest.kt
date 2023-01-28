fun main(){

    print("Enter principal amount:")
    val P= readLine()!!.toFloat()

    print("Please enter rate of Interest:")
    val R= readLine()!!.toFloat()

    print("Please enter Time in years(if time is less than a year enter time in point value): ")
    val T=readLine()!!.toFloat()

    val ci=P*(1 + R/100)*T

    print("Amount with Compound interest is: $ci")
}