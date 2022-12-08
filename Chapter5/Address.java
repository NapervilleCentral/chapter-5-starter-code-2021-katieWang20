//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address
{

   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }

   public int compareTo(Object obj)
   {
       return 0;
   }
    /**
     * compare the street name in order then if equal
     * compare the street number
     * 123 Elm < 123 Maples
     * 123 Elm > 50 Elm 
     * parseInt()
     */

   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
