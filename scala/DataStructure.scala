// Collections in Scala
object DataStructure{
  def main(args: Array[String]): Unit = {

    // List - Immutable, Homogeneous collection of data
    val fruits: List[String] = List("apple", "orange", "watermelon","garpes")
    println("First Element: "+ fruits.head)
    println("Last Element: "+ fruits.last)
    println("Excluding 1st Element: "+ fruits.tail)

    //Next method
    val  List1 = List("Hadoop", "Spark", "Python","SQL", true, 465, 87.87)
    println(List1)
    println(List1.getClass)

    //empty list decalartion
    val emptyList: List[Nothing] = List()

    //list declaration
    val List2 = 1::45::23::43::Nil  // add nil at end

    //create a list buffer of type mutable
    import scala.collection.mutable.ListBuffer

    var cities = new ListBuffer[String]()
    cities += "Trivandrum"
    cities += ("Mumbai", "Delhi", "Pune")
    cities -= "Mumbai"
    println(cities)
    cities.toList // Type casting in scala is done by toDataType()



    //Array Data Type - mutable, fixed size collection of data structure
    // homogeneous collection
    var arrayData = Array("apple", "orange", "watermelon","garpes")

    //print element by element output in new line
    arrayData.foreach(println)

    //print all values
    println(arrayData.mkString(","))

    arrayData(0) = "Mangoe"
    println(arrayData.mkString(","))

    //declare an empty array
    val arr_1 = new Array[String](10)
    // 2d array
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0) = 234
    arr_2(0)(1) = 300
    arr_2(1)(0) = 163
    arr_2(1)(1) = 98

    //print array
    val flattenArray: Array[Int] = arr_2.flatten
    println(flattenArray.mkString(","))

    //set collection - immutable collection
    // hashSet - mutable collection of set
    val set_1 : Set[String] = Set()

    val set_2 = Set("apple", "orange", "watermelon","garpes")

    import scala.collection.mutable.Set
    val mutableSet = Set("apple", "orange", "watermelon","garpes")
    mutableSet += "blueblerry"
    mutableSet -= "apple"

    //Tuple Declaration
    //tuple is fixed size, can hold multiple data types, Immutable
    val Tuple_1 = (10,30,23,56,78,90)
    // Tuple_1._1 = "Apple" ----- update will provide error

    println(Tuple_1._2) //accessing individual value

    //Map in Scala is collection of key value pair where each key is unique, It is similar to dictionary
    // in python

   // import scala.collection.immutable.Map

    //Empty variable declaration
    var MapVar: Map[String, Int] = Map()
    var MapVar1 = Map("UST1001" -> "Sandeep", "UST1002" -> "Mithun", "UST1003" -> "Vinesh","UST1004" -> "Adinana")
    println(MapVar1.contains("UST1003")) // give whether this key is present or not
    println(MapVar1.get("UST1003"))  //Access value using key
    println(MapVar1.keys) //print all keys
    println(MapVar1.values) //print all values

    import scala.collection.mutable.Map
    val mutable_Var = Map("UST1001" -> "Sandeep", "UST1002" -> "Mithun", "UST1003" -> "Vinesh","UST1004" -> "Adinana")

    mutable_Var("UST001") = "Rohit" //update existing value
    mutable_Var += ("UST1005" -> "Siva") //insert new key value pair

    //Iterator in Scala Programming
    //An iterator in scala represents a sequence of elements that allows you to traverse through a collection sequentially

    val myList = List(20, 30, 40, 50, 60, 70, 80, 90)
    val iter = myList.iterator

    //methods of iterator to check if there is more elements (.hasNext())
    //(.hasNext()), .next() - to retrieve next value
    //.remove() - to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())

    //lazy initialization using scala

    lazy val donuts: Int = 100
    println(donuts*5)

    //cannot use var
    //lazy var donuts_1 : Int = 20



  }
}