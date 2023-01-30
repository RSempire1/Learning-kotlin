fun main(){
    print("Please enter a year:")
    val a= readLine()!!.toInt()

    if(a%4==0 && a%100!=0)
        print("It is a Leap year")
    else
        print("It is not a leap year")
}