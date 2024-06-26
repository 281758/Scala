object EmployeeSalary {

  def main(args: Array[String]): Unit = {
    val EmployeeDetails = List(("Arun", 10000), ("Arjun", 50000),
      ("Aruna", 37000), ("Ramees", 97000), ("Malu", 80000))

    var salarySum = 0.0
    EmployeeDetails.foreach { emply =>
       salarySum = emply(1) + salarySum
    }
    val avgSal = (salarySum * 10)/100
    println("Total Salary is "+salarySum)
    println("10% of total salary is "+avgSal)

    val(higher, lower) = EmployeeDetails.partition(_._2>avgSal)
    println("Higher salary "+ higher)
    println("Lower salary "+ lower)

  }
}
