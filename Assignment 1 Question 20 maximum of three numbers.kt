fun main(){
    print("Please enter 1st number:")
    val a=readLine()!!.toFloat()
    print("Please enter 2nd number:")
    val b= readLine()!!.toFloat()
    print("Please enter 3rd number:")
    val c= readLine()!!.toFloat()


    if(a>b && a>c)
        print("First number is biggest")
    else if(b>c && b>a)
        print("Second number is biggest")
    else if(a==b && b==c )
        print("All numbers are same ")
    else
        print("Third number is greatest")


}