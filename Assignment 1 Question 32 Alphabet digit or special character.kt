fun main() {

    print("Please enter a character :")
    val a = readLine()
    if (a != null) {

        if (a in "a".."z") {
            print("character is a alphabet")
        } else if (a in "-9999999".."999999") {
            print("character is a number")
        } else {
            print("Special character ")
        }
    }
}



