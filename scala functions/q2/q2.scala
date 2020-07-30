object functionsANDdata extends App{
  
class rational(n:Int,d:Int)
{
	  require(d>0,"d has to be greater than zero");
    def numerator=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(x:Int,y:Int):Int = if(y==0) x else gcd(y,x%y);
    def +(r:rational)=new rational(this.numerator*r.denom + this.denom*r.numerator,this.denom*r.denom);
    def neg=new rational(-this.numerator,this.denom);
    def -(r:rational)=this+r.neg;
    override def toString= numerator.toString+"/"+denom.toString;
}
    
    val rat1=new rational(3,4);
		val rat2=new rational(5,8);
		val rat3=new rational(2,7);
		val rat4=rat1-rat2-rat3;
		println("X-Y-Z = "+rat4);

}