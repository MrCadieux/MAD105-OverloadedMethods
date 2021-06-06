fun main() {
    var choice: Int
    var name: String
    var business: String
    var phoneNum: String

    println("Welcome to the Overloaded Method Business\n")
    print("What is your name: ")
    name = readLine()!!.toString()
    print("What is your phone number: ")
    phoneNum = readLine()!!.toString()
    println()

    do {
        println("What type of customer are you $name?")
        println("1: Residential")
        println("2: Business")
        println("3: Get me out of here!")
        print("Enter here: ")
        choice = readLine()!!.toInt()

        if (choice == 1){
            println("\nCustomer Information")
            println(customer(name, phoneNum))
            println()
        }else if (choice == 2){
            println("What is the name of your business: ")
            business = readLine()!!.toString()
            println("\nCustomer Information")
            println(customer(business, name, phoneNum))
            println()
        }else if (choice !=3){
            println("That is not an option, try again")
        }

    } while(choice!=3)
    println("Thanks for checking us out today $name")
}

fun customer(contactName: String, phone: String): String{
    return ("Name: " + contactName + "\n" + "Phone#: "+phone)
}

fun customer(businessName: String, contactName: String, phone: String): String{
    return ("Business: " + businessName + "\n" + "Name: " + contactName + "\n" + "Phone#: "+phone)
}