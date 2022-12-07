
public class Student //implements Comparable
{
    // created when the first student is created or instantiated
    // only ONE population variable is created - shared with all student objects
   private static int population;
    //public static int population;
    // can init the static 
   private String firstName, lastName;
   private Address homeAddress;

   private static Address schoolAddress = new Address("440 W. Auroura Avenue", "Naperville", "IL", 60540);



   /**
   //  Sets up this Student object with the specified initial values.
   */
   public Student (String first, String last, Address home)
   {
       //static var increase pop for ever student created in that school
       population ++; //System.out.println(population  );

      firstName = first;
      lastName = last;
      homeAddress = home;

   }
/**------------------------------------------------
// returns the population = to the amount of student objects created
*/
   public static int get_pop ()
   {
       return population;
   }
    // you need an object to access this static variable

    public Address getSchool()
    {

        return schoolAddress;

    }


    /**
      //  implement Comparable by make the compareTo method
   */

   public int compareTo(Object obj)
   {
        int result = 0;
       Student temp = (Student) obj;

       return result;
   }




  public String get_name()
  {
       return firstName;
  
  }





    /*returns the amount of studnet obj created*/
   //does not need object. you can acess using Studen.getPop or Student obj.getPop;
   
   public static int getPop()
   {
       return population;
    
   }



   /**
   //  Returns this Student object as a string.
       @return ________
   */
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      //result += "School Address:\n" + schoolAddress;
        
      return result;
   }
}//end of Student
