
public class Student //implements Comparable
{
	//private static int population;
	//public static int population;

   private String firstName, lastName;
   private Address homeAddress;

   //private static Address schoolAddress;



   /**
   //  Sets up this Student object with the specified initial values.
   */
   public Student (String first, String last, Address home)
   {
	   //static var increase pop for ever student created in that school
	   //population ++; //System.out.println(population  );

      firstName = first;
      lastName = last;
      homeAddress = home;

   }
/**------------------------------------------------
// returns the population = to the amount of student objects created

   public static int get_pop ()
   {
	   return population;
   }


	public Address getSchool()
	{

		return schoolAddress;

	}
*/

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





	/*returns the amount of studnet obj created
   public static int get_pop()
   {
	   return population;

   }
*/


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
