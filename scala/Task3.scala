import scala.io.StdIn

object Task3 {
  var AccountAmount: Int = 0

  def BankBalance(): Unit = {
    println("Bank balance is , " + AccountAmount)
  }

  def Withdraw(): Unit = {
    if (AccountAmount == 0) {
      println("Account has 0 balance ")
    }

    else {
      println("Enter amount to withdraw : ")
      val amount = StdIn.readInt()
      if (amount < 0) {
        println("Negative amount!")
      }
      else if (amount > AccountAmount) {
        println("Amount is greater than balance")
      } else {
        AccountAmount = AccountAmount - amount
        println("Amount withdrawed")
      }
    }
  }

  def Deposit(): Unit = {
    println("Enter amount to deposit: ")
    val amount = StdIn.readInt()
    if (amount < 0) {
      println("Negative amount!")
    }
    else {
      AccountAmount = AccountAmount + amount
      println("Amount added")
    }
  }


  def bankingMenu(): Unit = {
    // create banking menu:  1. check balance 2. withdraw amount 3. deposit  4. Exit
    var continue = true
    while (continue) {
      import scala.io.StdIn


      println("\n\nSelect from the below options\n" +
        "1. Check bank balance\n" +
        "2. Withdraw amount\n" +
        "3. Deposit amount\n" +
        "4. Exit\n")
      val option = StdIn.readInt()

      if (option == 1) {
        BankBalance()
      }
      else if (option == 2) {
        Withdraw()
      }
      else if (option == 3) {
        Deposit()
      }
      else {
        println("Exiting")
        continue = false
      }
    }

  }

  def main(args: Array[String]): Unit = {
    bankingMenu()
  }

}