object functionsANDdata extends App{
  
 class Account(id:String, n: Int, b: Double){

    val nic:String = id
    val accNumber: Int = n
    var accbalance: Double = b

    override def toString: String = "[" + nic + ":" + accNumber + ":" + accbalance + "]"
    def deposit(a: Double): Unit = this.accbalance += a
    def withdraw(a: Double): Unit = this.accbalance -= a   
    def transfer(acc: Account, b: Double) = {
      this.withdraw(b)
      acc.deposit(b)
    }
  }

  val x = new Account("982200385", 100, 30000)
  println("Account created -> "+ x.toString)
  x.deposit(5000)
  println("Credited 5000 to " + x.accNumber + " -> " + x.toString)
  x.withdraw(2000)
  println("Debited 2000 from " + x.accNumber + " -> " + x.toString)

  val y = new Account("981266214", 200, 10000)
  println("Account created -> " + y.toString)
  x.transfer(y,5000)
  println("Transferring 5000 from " + x.accNumber + " to " + y.accNumber + "...")
  println("Debited 5000 from " + x.accNumber + " -> " + x.toString)
  println("Credited 5000 to " + y.accNumber + " -> " + y.toString)
  
  

}