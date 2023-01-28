fun main(){

    print("Enter principal amount:")
    val P= readLine()!!.toFloat()

    print("Please enter rate of Interest:")
    val R= readLine()!!.toFloat()

    print("Please enter Time in years(if time is less than a year enter time in point value): ")
    val T=readLine()!!.toFloat()

    val SI=(P*R*T)/100

    print("Simple interest is: $SI")


}