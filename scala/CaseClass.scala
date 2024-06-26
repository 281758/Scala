//case classes are a special classess in scala programming that are immutable
// and are compared by value. they are ideal for use in pattern matching.

case class Person(name: String, salary: Int)
  object CaseClass extends App{
    //create an instance of case class
    val person1 = Person("Devika", 55000)
    val person2 = Person("person2", 7000)

    //print person details
    println(person1)
    println(person2)

    val person3 = person1.copy(salary = 60000)
    println(person3)

    //pattern matching with case class
    //pattern matching in scala allows you to match values against pattern
    //execute code based on the match
    person1 match{
      //case pattern1 => result1
      //case pattern2 => result2
      //case _ => default
      case Person(name, salary) => println(s"Name : $name, Salary : $salary")
    }
  }

