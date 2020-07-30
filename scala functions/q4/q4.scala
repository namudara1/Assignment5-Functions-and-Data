object functionsANDdata extends App{
  
 class account(id:String,aNumber:Int,balance:Double)
{
	var nic=id;
	var accNumber=aNumber;
	var accBalance=balance;
	
	
		
}
  
   		 var acc1=new account("id1",1111,30000);
		var acc2=new account("id2",2222,10000);
		var acc3=new account("id3",3333,50000);
		var acc4=new account("id4",4444,-1000);
		var acc5=new account("id5",5555,-10000);
		var acc6=new account("id6",6666,0);
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6);
		
		val overdraft=(list:List[account])=>list.filter(x=>x.accBalance<=0);
	  val Balance=(list:List[account])=>list.reduce((x,y)=>new account("S000",1000,x.accBalance+y.accBalance));
	  val interest=(list:List[account])=>list.map(x=>(if(x.accBalance>0) x.accBalance*1.05d else x.accBalance*1.01d));
		
		print("Overdraft account numbers   : ");
		var ODlist=overdraft(bank);
		ODlist.foreach(x=>print(x.accNumber+"   "));
		
		var totBalance=Balance(bank);
		print("\nTotal account balance    : "+totBalance.accBalance);
		
		print("\nAccount balances with interest : ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));
		
  
}