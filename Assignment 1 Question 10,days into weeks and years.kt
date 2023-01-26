fun main(){
    print("Please enter days:")
    val days=readLine()!!.toInt()

    val weeks=days/7
    println("$weeks weeks")

    val months=days/30
    println("$months  months")

    val years=days/365
    println("$years  years")


}