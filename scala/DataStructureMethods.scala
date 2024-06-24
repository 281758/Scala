object DataStructureMethods{
  def main(args: Array[String]): Unit ={

    //list and methods
    val list_1 = List("apple", "cherry", "oranges","watermelon")
    //empty list
    val list2 = List()
    //Basic operations
    val firstelement = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)

    //check if collection  is empty
    val islistempty = list_1.isEmpty
    println(islistempty)

    //size of list
    val length = list_1.length

    //adding and removing elements from list
    val list_2 = List(1,2,3,4,5,6)
    val newList = 0 :: list_2
    val appendList = list_2 :+ 9

    //concatenation between 2 list
    val concatList  = list_2:: List(9,10,11,12)
    val concatList_2 = list_2  ++ List(9,10,11,12)
    print(concatList)

    //remove elements
    //drop values from start of list
    println(concatList.drop(3))

    //remove by value
    val updatedList = concatList.filter(_ != 3)
    val updatedList1 = concatList.diff(List(3,4,5))

    // Transforming lists

    list_2.map(_ *2)
    list_2.filter(_ %2 == 0)
    val nestedList = List(List(1,2,3), List(4,5,6),List(7))
    val flatList = nestedList.flatMap(identity)
    println(flatList)
    val sum = flatList.reduce(_ + _) // aggregate operation

    //slicing and subset of list
    list_1.take(3) // 1st 3 elements
    list_1.takeRight(3) //last 3 elements
    list_1.dropRight(2) // without last 2 elements
    list_1.slice(1,4) // 1st index to 3rd index

    //converting list to map
    val listofTuples = List(("UST1001","Krishna"),("UST1002","Rohit"),("UST1003","Adinan"))
    val map = listofTuples.toMap

    //Zipping list
    val zippedList = list_1.zip(list_2)
    println(zippedList)
    val (fruits, numbers) = zippedList.unzip
    println(fruits)

    //sets and sets method
    val set1 = Set(1,2,3,4,5,6,7,8)
    val set2 = Set("apple", "cherry", "oranges","watermelon","guava")

    set1.contains(3) //returns bool value
    set1 + 9
//    set - 7

    //set operations
    val setA = Set(10,20,30,40)
    val setB = Set(50,60,70,80)
    val unionSet = setA union setB
    setA intersect setB
    setA diff setB
    //subset
    setA.subsetOf(setB)

    //map
    val setmap = unionSet.map(_ + 3)
    println(setmap)

    val sumset = setA.reduce(_ + _)
    println(sumset)

    val filterset = setB.filter(_ != 70)
    print(filterset)

    setB.foreach(println)


    //arrayssssssssssss
    val array1 = Array("kochi","varkala","trivandrum","alappuzha")
    val array2 = Array(1,2,3,4,5,6,7,8)

    //empty array
    val emptyArray = Array[Int]()

    array2(0) = 10
    //array2 += 9 //size is fixed, cannot add or remove elements

    import scala.collection.mutable.ArrayBuffer
    //Adding elements (Array are fixed size, so we use ArrayBuffer)
    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7)
    arrayBuffer += 8
    arrayBuffer -= 5
    arrayBuffer.map(_ * 2)
    val array3 = arrayBuffer.toArray

    //nested array
    val nestedArray = Array(Array(1,2,3), Array(4,5,7), Array(8,9))
    val flatArray = nestedArray.flatten

    //slicing an array
    flatArray.slice(1,5)
    val array4 = Array(30, 40, 10, 80, 60, 20, 50)
    println(array4.sorted)
    println(array4.reverse)

    //groupBy() in scala collection

    var cityNames = Array("kochi","varkala","trivandrum","alappuzha","munnar")
    val groupbyLen = cityNames.groupBy(_.length)
    val groupbyFirstChar = cityNames.groupBy(_.charAt(0))
    val groupOddEven = flatArray.groupBy(num => if(num %2 ==0) "even numbers" else "odoo numbers")
    groupOddEven.foreach{
      case(key, value) => println(s"$key : ${value.mkString(", ")}")
    }

    var array_1 = Array("apple","mangoe","straw","pineapple","watermelon")
    val groupVowConso = array_1.groupBy(characters => if(("aeiouAEIOU").contains(characters.head)) "vowels" else "consonents")
    groupVowConso.foreach{
      case(key, value) => println(s"$key: ${value.mkString(", ")}")
    }

    //collection - map

    val immutablemap = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)

    import scala.collection.mutable
    val mutablemap = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)
    //print ouput stored in key
    println(immutablemap("a"))
    //concat 2 maps
    val mapA = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)
    val mapB = Map("e" -> 5, "f" -> 6, "g" -> 7, "h" -> 8)
    val mergedMap = mapA ++ mapB
    println(mergedMap)

    //transforming keys and values
    val incrementvalue = immutablemap.mapValues(_ + 1)
    val tranformkey = immutablemap.map{ case(k,v) => (k.toUpperCase, v)}
    incrementvalue.foreach{
      case (key, value) => println(s"$key -> $value")
    }




  }
}
