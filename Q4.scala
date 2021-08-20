object Bank extends App {

  var Bank : List[Account] = List( new Account("Nipun" , 85446 , -5000) , new Account("Madhusanka" , 85741 , 8000) )

  val Find = ( N : Int , B : List[Account]) => B.filter( x => x.AccountNum.equals( N ))

  val Negative = ( B : List[Account] ) => B.filter( x => x.Balance < 0)

  val total_balance = ( B: List[Account] ) => B.map( x => (x,x.Balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

  val interest = ( B : List[Account] ) => B.map( x => {
    x.Balance match {
      case a if a >= 0 => x deposit(x.Balance * 0.05)
      case _ => x withdraw Math.abs(x.Balance) * 0.01

    }
    x
  })


   println("Negative Balance Accounts " + Negative( Bank ) )
   println()
   println("Before add interest " + total_balance( Bank )._2 )
   println()

   Bank = interest( Bank )

   println("After add interest " + total_balance( Bank )._2 )
  println()

}