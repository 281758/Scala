//class with companion object using scala
//companion objects can be used to provide factory methods
// and utility functions related to a class

//a companion obj will have same name as of class name and same scope it resides within same file
//access to private members of class or trait
//this can be accessed directly using class name without any instance of class

class Circle (val radius: Double){
  def area: Double = Math.PI * radius * radius
  def circumference : Double = 2 * Math.PI * radius
}

object  circle{
  def apply(radius: Double): Circle = new Circle(radius)
  
}

object  CompanionObj extends App{
  //create an instance using companion object
  var circle= Circle(6.0)
  println(circle.area)
  println(circle.circumference)
}
