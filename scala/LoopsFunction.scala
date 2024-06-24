object LoopsFunction {
  def main(args: Array[String]): Unit ={

    //do-while loop
    var j =1
    while{
      println(j)
      j += 1
      j <= 5
    }do()

    //for loop with range and step size
    for (i <- 1 to 10 by 2){
      println(i)
    }

    //iterating over a collection
    val fruits = List("apples", "cherry", "oranges", "pineapple", "strawberry")
    for(fruit <- fruits){
      println(fruit)
    }

    //complex conditions

    import scala.io.StdIn
    println("enter temperature: ")
    val temperature = StdIn.readInt()
    println("enter humidity: ")
    val humidity = StdIn.readInt()
    val weatherDesc = if (temperature > 30 & humidity > 60){
      "Hot & humid"
    }else if (temperature > 45 & humidity < 60){
      "Hot"
    }else if (humidity>70 & temperature < 25){
      "humid"
    }else{
      "pleasant"
    }
    println(weatherDesc)

    //functions in scala
    def add(a : Int, b: Int): Int = {
      a+b
    }

    //anonymous functions like lambda
    val summation = (a: Int, b: Int) => a+b
    println(summation(5,6))

    //problem : find the maximum element in a list
    def maximumele(lst : List[Int]): Int = {   //lst given instead of args
      lst.max
    }
    val numbers = List(1,3,5,2,4,7)
    val maxmum = maximumele(numbers)
    println(maxmum)

    // factorial of a number
    def factorial(num : Int) : Int = {
      if (num ==0) 1
      else num * factorial(num - 1)
    }
    val factvalue = factorial(6)
    println(factvalue)
    
    
  }

}
