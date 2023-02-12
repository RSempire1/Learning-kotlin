fun main(){

    print("Please enter the angles of the triangle:")

    val angle1=readln().toFloat()
    val angle2=readln().toFloat()
    val angle3=readln().toFloat()

    val sum=angle1+angle2+angle3


    if(sum== 180.toFloat() && angle1 > 0 && angle2 > 0 && angle3 > 0){
        print("Triangle is valid")
    }
    else{
        print("Triangle is not valid")
    }
}