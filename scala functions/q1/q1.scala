object functionsANDdata extends App{
  
 	class rational(n:Int,q:Int)
{
	  require(q>0,"q has to be greater than zero");
    def numerator=n/gcd(n,q);
    def denom=q/gcd(n,q);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def neg=new rational(-this.numerator,this.denom);
    override def toString= numerator.toString+"/"+denom.toString;
}
    
    val rat1=new rational(13,11);
    val rat2=rat1.neg
    println("Number   : "+rat1);
		println("Negetion : "+rat2);

}