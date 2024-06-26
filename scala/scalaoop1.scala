//inheritance - example demonstrates inheritance

class Animal(val name: String){
  def makeSound(): Unit ={
    println(s"$name is making a sound")
  }
}

//subclass
class Dog(name: String) extends Animal(name){
  override def makeSound(): Unit = {
    println(s"$name  says woof")
  }
}

object InheritObj extends App{
  val animal = new Animal("Generic name")
  animal.makeSound()
  val dog = new Dog("Charlie")
  dog.makeSound()
}
