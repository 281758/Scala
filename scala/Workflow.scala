object Workflow {
  def main(args: Array[String]): Unit ={
    //1. map functions
    //map functions transform each element of a collection using given function
    val numbers = List(1,2,3,4,5,6,7,8)
    val doubleNum = numbers.map(_*2)
    val stringList = numbers.map(_+"Number")
    println(stringList)
    stringList.foreach(println)
    val lenghth= stringList.map(_.length)   // find lenght of each string
    println("length is "+ lenghth)

    //2. flat map  --  this function flattens multi dimension collections into single collections

    val nestedList = List(List(1,2,3), List(4,5,6), List(7,8))
    nestedList.flatMap(identity)

    val sentances = List("hello scala you are awesome","scala is funny")
    val wordsSentance = sentances.flatMap(_.split(" "))

    //3.filter  - select elements from collection that satisfy for a given condition

    val shortWords = wordsSentance.filter(_.length <= 4)
    println("short words"+shortWords)

    //4. fold - reduced function
    println(numbers.fold(20000)(_+_))

    //reduce function - combines elements of collection
    val words2 = List("This", "Should","Form","a", "Sentance")
    val sentanceFormed = words2.reduce(_+" "+_)

    //foreach - function that applies a given procedure to each element of a collection
    sentances.foreach(word => println(word.toUpperCase))

    //collect - applies a partial function to the elements of colleciton and returning a new collection
    val number1 = List(1,2,3,4,5,6,7,8,9,10)
    val oddNumber = numbers.collect{case x if x % 2 != 0 => x}
    println(oddNumber)

    val wordsList = List("hello", "do", "how", "funny", "beautiful")
    val largeWords = wordsList.collect{case x if x.length >=5 =>x}
    println(largeWords)

    //partition - will split collections into 2 parts based on predicate.
    var (shortwords, longwords) = wordsList.partition(_.length < 4)
    println("short words"+shortwords+longwords)

    //group by - groups the collection based ona given function
    val numbers1 = List(12, 13, 14, 15, 16, 18)
    println(numbers1.groupBy(_ %2 == 0))

    //scan - similar to fold, but returns a collection of successive cummulative results of binary operation
    println(numbers1.scan(0)(_+_))




  }

}
