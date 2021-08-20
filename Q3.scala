object Q3{

  def main(args: Array[String]): Unit = {
    val p = new Account("199934310393",19000847,78541.25);
    val q = new Account("199934310393",19000847,78541.25);

    p.transfer(1500,q)
    println(p)
    println(q)

  }
}

class Account ( x:String , y: Int , z : Double){

  val NIC : String = x
  val AccountNum : Int = y
  var Balance : Double = z

  def withdraw( Amount : Double ) = this.Balance -= Amount

  def deposit ( Amount : Double ) = this.Balance += Amount

  def transfer( Amount : Double , that : Account ): Unit = {
    this.Balance =  this.Balance - Amount
    that.Balance = that.Balance + Amount
  }

  override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.AccountNum + "\n Balance : " + this.Balance
}