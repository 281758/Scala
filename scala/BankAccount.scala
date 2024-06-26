class Account(val accountNum: String, var balance: Double){
  def deposit(amount: Double): Unit = {
    if (amount > 0)
      {
        balance += amount
      }
  }

  def withdraw(amount: Double): Unit ={
    if(amount > 0 && amount <= balance){
      balance -= amount
      println(s"withdraw $amount, new balance: $balance")
    }else{
      println("Insufficient funds or invalid amount")
    }
  }

  def getBalance: Double = balance

}

object BankingApp{
  def main(args: Array[String]): Unit ={
    //create an instance of account
    val account1 = new Account("UST1001", 1000.0)
    val account2 = new Account("UST1002", 1040.0)
    println(s"Account number : ${account1.accountNum} , inital balance: ${account1.balance}")
    account1.deposit(5000.0)
    account1.withdraw(200.0)
    println(s"final balance: ${account1.getBalance}" )
  }
}
