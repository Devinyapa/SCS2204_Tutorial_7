object main extends App{

  var bank:List[Account]=List(new Account("992142200V",20110209,350000),new Account("998714450V",123465678,800000),new Account("967854780V",78368984,760000),new Account("924567894V",20119696,-55),new Account("545807456V",45612387,-8000),new Account("7885555256V",51248697,90000))

  class Account(id:String, n:Int, b:Double){

    var nic:String=id
    var acnumber:Int=n
    var balance:Double=b

    override def toString="["+nic+ ":" +acnumber+ ":" +balance+"]"

    def withdraw(a:Double)= this.balance = this.balance-a

    def deposit(a:Double)= this.balance = this.balance+a

    def transfer(a:Account,b:Double)= {
        this.withdraw(b);
        a.deposit(b)
    }

  }

  val negBalance=(b:List[Account])=> b.filter(x=>x.balance<0)

  val totBalance=(b:List[Account])=> b.reduce((x,y)=>new Account("Bank",1111,x.balance+y.balance))

  val interest=(b:List[Account])=>b.map(x=> if(x.balance>0){ x.balance=x.balance+x.balance*0.05 }
                                               else { x.balance=x.balance+x.balance*0.1 } )


  println("List of Accounts with negative balances " + negBalance(bank))
  println("\nSum of all account balances "+totBalance(bank))
  println("\nBalances of all account Before apply interest function "+bank)
  interest(bank)
  println("Final balance of all account after apply interest function "+bank)

}
