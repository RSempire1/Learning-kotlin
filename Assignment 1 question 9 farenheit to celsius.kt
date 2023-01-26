fun main(){

    print("Please enter temperature in farenheit:")

    val farenheit=readLine()!!.toFloat()

    val celsius=((farenheit-32)*5)/9

    print("Temperature in celsius is $celsius")



}