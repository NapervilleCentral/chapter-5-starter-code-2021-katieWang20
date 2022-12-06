/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */

//import BreezySwing.Format;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class Address_test
{
	  public static void main (String[] args)
   {



	Address home = new Address("456 Elm st", "Naperville", "IL", 60565);


	Address home1 = new Address("23 Maple st", "Naperville", "IL", 60565);
	Address home2 = new Address("12 Grace st", "Naperville", "IL", 60565);
	Address home3 = new Address("4 Stewert st", "Naperville", "IL", 60565);
	Address home4 = new Address("1874 Allen st", "Naperville", "IL", 60565);
	Address home5 = new Address("4500 Wilson st", "Naperville", "IL", 60565);
	Address home6 = new Address("62 Allen st", "Naperville", "IL", 60565);


	Address home7 = new Address("1111 Elm st", "Naperville", "IL", 60565);
	Address home8 = new Address("8 Grace st", "Naperville", "IL", 60565);
	Address home9 = new Address("005 St. Charles st", "Naperville", "IL", 60565);



	System.out.print(home.compareTo(home1)); //neg result
	System.out.print(home1.compareTo(home)); //pos result






}//end of main
}//end of class