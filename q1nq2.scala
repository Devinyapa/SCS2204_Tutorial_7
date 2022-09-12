object main extends App{

   class Rational(x:Int,y:Int){
      var numer=x
      var denom=y

      override def toString = numer+ "/" + denom

      def neg=new Rational(-this.numer,this.denom)

      def sub(r:Rational):Rational={
         new Rational(this.numer*r.denom-r.numer*this.denom, this.denom*r.denom)
      }
   }

   val n1=new Rational(1,2)
   val x=new Rational(3,4)
   val y=new Rational(5,8)
   val z=new Rational(2,7)


   println(n1.neg)

   println((x.sub(y)).sub(z))

}
