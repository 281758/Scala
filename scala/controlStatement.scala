object ControlStatement {
  def main(args: Array[String]): Unit = {
    //example1 : if-else

    import scala.io.StdIn

    /* println("Enter a number: ") // ask user to input data
    var x1 = StdIn.readLine().toInt // typecast it to an integer data type

    if (x1> 0){
      print("Value is positive")
    }
    else if(x1<0){
      println("Value is negative")
    }
    else{
      println("Value is zero")
    }

    //example 2: using if else as an expression
    println("Enter a number: ")
    val x2 = StdIn.readLine().toInt
    val output = if (x2 %2 == 0) "even" else "odd"
    println(output)

    //example 3: while loop using scala

    var i = 1
    while ( i <= 5){
      println(s"value of i is $i ")
      i += 1
    }

    */

    //example 4 - for loop in scala
    val List_1 = List("Kerala", "UST001", 22, "CSE", 3.14)
    for (value <- List_1) {
      println(value)
    }

    //example 5 - generate a collection of even numbers
    //    val numbers = (1 to 50).toList
    //    val even = for {
    //                  num <- numbers
    //                  if num % 2 == 0
    //                   } yield num  // yield is keyword in scala to generate new collection from an existing
    //    println(even)
    //
    //example 6 - generate collection of prime numbers

    //    val number = (2 to 100).toList
    //    val prime = for{
    //                num <- number
    //                if (2 until num).forall(x => num % x != 0)
    //    }yield num
    //
    //    println(prime.mkString(","))

    // task 1 - processing and filtering data
    // Sample record = (product name, unit price, discount, quantity)
    // 1. Filter out products that have price greater than $50
    // 2. Calculate total cost of each product
    // 3. Print the name of products that has exceeded total cost greater than $300

    val Product_List = List(("Apple", 10.00, 2.00, 5),
      ("Milk", 20.00, 2.00, 10),
      ("Dairy Milk", 55.00, 4.00, 20),
      ("Rice", 100.00, 10.00, 20))

    val product_greater = for {
      product <- Product_List
      if (product(1) > 50.00)
    } yield product(0)

    println("Products with price greater than $50 "+product_greater)


    for (i <- Product_List) {
      println("Total Price for " + i(0) + " is " + ((i(1) * i(3)) - i(2)) + ".Rs")
    }

    //Total Price greater than 300
    for (i <- Product_List) {
      if (((i(1) * i(3)) * i(2)) > 300) {
        println(i(0))
      }
    }
  }
}