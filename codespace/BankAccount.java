class BankAccount{
   private String accountnumber;
   private String accountholdername;
   private double balance;
   private String accountype;
   public BankAccount(String accountnumber,String accountholdername ,String accounttype){
      this.accountnumber = accountnumber; 
      this.accountholdername = accountholdername;
      this.accountype = accounttype;
      this.balance = 0;
   } 
   public BankAccount(String accountnumber ,String accoutholdername ,String accounttype ,double initialdeposite ){
      this.accountnumber = accountnumber; 
      this.accountholdername = accountholdername;
      this.accountype = accounttype;
      this.balance = initialdeposite;
   }
   public void deposite(double amount){
      if(amount<=0){
         System.out.println("invalid deposite amount");
      }else{
         balance+=amount;
         System.out.println("Deposited:"+amount);
       }
   }
   public void withdraw(double amount){
      if(amount<=0){
         System.out.println("invalid withdrawal amountn");
      }else if(amount>balance){
		  System.out.println("Insufficient balance:");
	  }
	  else{
		  balance-=amount;
		  System.out.println("Withdrawn:"+amount);
	  }
   }
   public double getbalance(){
	   return balance;
   }
   public void displayaccountinfo(){
	   System.out.println("Account number:"+accountnumber);
	   System.out.println("Account Holder:"+accountholdername);
	   System.out.println("Account Type:"+accountype);
	   System.out.println("Balance:"+balance);
	   System.out.println();
   }
  
}
class Accountinfo{
	   
	    public static void main(String[]args){
	   BankAccount acc1=new BankAccount("1001","Nandini","Savings");
	   BankAccount acc2=new BankAccount("1002","Spoorthi","current",5000);
	   acc1.deposite(2000);
	   acc1.withdraw(500);
       acc2.deposite(1000);
	   acc2.withdraw(3000);
	   acc1.displayaccountinfo();
	   acc2.displayaccountinfo();
}}