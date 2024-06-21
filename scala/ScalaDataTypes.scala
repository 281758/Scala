//'object' is a singleton instance that is lazily initiated when it is first accessed.
// It is similar class but only one instance will be created automatically.

object  DataTypes{
  //main is entry point to any Scala Application
  //unit defines the return type of 'main' indicating that it returns nothing
  def main(args: Array[String]): Unit = {
    //Integer data type
    val intNum: Int = 20
    val longNum: Long = 1234567890L  // end with L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    //Floating data type
    val FloatingNum: Float = 3.14f // f in the end
    val doubleNum: Double = 3.26735423786

    //String data type
    val stringVar: String = "Hello Scala"

    //Character Datatypes
    val charvar: Char = 'A'

    //Unit data type
    val unitValue: Unit = ()

    //Printing values
    println(s"Integer:  $intNum")
    println(s"Byte Number: $byteNum")
    println(s"String : $stringVar")

    //Mutable data types

    //Boolean - true, false
    var boolVar: Boolean = true
    print("Boolean "+ boolVar)

    var intVar: Int = 123
    print("Integer "+intVar)
    // Update item assignment in mutable variable
    intVar = intVar + 100
    print(" New Integer "+intVar)


  }
}