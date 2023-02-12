fun main() {

    print("Please enter a Amount:")

    val a = readln().toFloat()

    println("Press 1 for 500 note\n Press 2 for 100 note \nPress 3 for 20 note \nPress 4 for 10 note\nPress 5 for 5 note")

    val option = readln().toInt()
    var result:Int

    if (option == 1) {
         result = (a/500).toInt()

        print("No of 500 inr notes: $result")
    }

        else if (option == 2){
         result = (a/100).toInt()

        print("No of 100 inr notes:$result")
    }

    else if(option == 3) {
         result = (a/20).toInt()

        print("No of 50 inr notes: $result")
    }

        else if(option ==4){

            result= (a/10).toInt()
            print("No of 10 inr notes: $result ")
    }
     else if(option ==5){

         result= (a/5).toInt()
         print("No of 5 inr notes: $result")
    }
    else{
        print("Invalid input")
    }




}

