//define class
class Car(val make: String, var model:String, var year:Int){
  def displayInfo(): Unit = {
    println(s"Car Info: $year $make $model")
  }
}

//create an object of class car

object SimpleClass extends App{
  val car = new Car("Toyota", "Corolla", 2019)
  //call method using car object
  car.displayInfo()
  //modify values of class
  car.year = 2000
  car.model = "Fortuner"
  car.displayInfo()
}
