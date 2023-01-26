fun  main(){

    print("please enter temperature in celsius:")

    val celsius= readLine()!!.toFloat()

    val farenheit=celsius*1.8+32

    print("Temperature in farenheit is: $farenheit")


}