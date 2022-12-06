//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account implements lockable, atm ,Comparable
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%

	private boolean locked_obj = false;
	private int password;

   private int acctNumber;
   private double balance;
   private String name;

   /**-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   */
   public Account (String owner, int account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      password = 54321;
   }
   public Account()
   {
   }

   /**-----------------------------------------------------------------
   //  Validates the transaction, then deposits the specified amount
   //  into the account. Returns the new balance.
   */
   public double deposit (double amount)
   {
      if(locked_obj)
      {
		  System.out.println("access is denied--foo");
		  return 0;
	  }
		  if (amount < 0)  // deposit value is negative
		  {
			 System.out.println ();
			 System.out.println ("Error: Deposit amount is invalid.");
			 System.out.println (acctNumber + "  " + fmt.format(amount));
		  }
		  else
			 balance = balance + amount;
		  return balance;



   }

   /**-----------------------------------------------------------------
   //  Validates the transaction, then withdraws the specified amount
   //  from the account. Returns the new balance.
   */
   public double withdraw (double amount, double fee)
   {
	   if (locked_obj)
	   {
		   System.out.println("access denied foo");
		   return 0;
	   }
			amount += fee;

			if (amount < 0)  // withdraw value is negative
			{
			 System.out.println ();
			 System.out.println ("Error: Withdraw amount is invalid.");
			 System.out.println ("Account: " + acctNumber);
			 System.out.println ("Requested: " + fmt.format(amount));
			}
			else
			 if (amount > balance)  // withdraw value exceeds balance
			 {
				System.out.println ();
				System.out.println ("Error: Insufficient funds.");
				System.out.println ("Account: " + acctNumber);
				System.out.println ("Requested: " + fmt.format(amount));
				System.out.println ("Available: " + fmt.format(balance));
			 }
			 else
				balance = balance - amount;

			return balance;
   }

   /**-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   */
   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

   /**
   //  Returns the current balance of the account.
   */
   public double getBalance ()
   {
      return balance;
   }

   /**
   //  Returns the account number.
   */
   public int getAccountNumber ()
   {
      return acctNumber;
   }

   /**
   //  Returns a one-line description of the account as a string.
   */
   public String toString ()
   {
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }


   public int get_pass()
   {
	   if (locked())
	   	return -1;
	   else
	   	return password;

   }

   //atm methods------------------------------------
   //this section will implement atm

   public void transfer (Account obj, double amount)
   {
	   obj.balance -= amount;
	   this.balance +=amount;


   }
   public String statement ( int pass)
   {

	   		return "NA";


   }

   public double query (int pass)
   {

	   		return -1;


   }


     /**lockable methods----------------------------
      //  This is the section to implement interface lockable
      */
     public void setkey (int pass)
     {

	 }

	 public void lock ( int locker)
	 {
		 if (locker == password)
		 	locked_obj = true;

	 }
	 public void unlock(int unlocker)
	 {

	 }

	public boolean locked ()
	{
		return true;
	}

	//Comparable methods----------------------------
	      /**  This is the section to implement interface Comparable
	      // it compares the acctNumber
	      */
	public int compareTo (Object o)
	{
		return 0;


	}//end of compareTo
}//end of class




















