
/**
 * Write a description of class Student_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student_Test
{
   public static void main (String[] args)
   {



    Address home = new Address("456 Elm st", "Naperville", "IL", 60565);
    Address school = new Address("540 W Auora Ave", "Naperville","IL",60540);

    Student Taylor = new Student("Taylor","Swift",home);
    Student Jill = new Student("Jill","Jones",home);
    Student Tom = new Student("Tom","Jones",home);
    Student Harry = null;
    Harry = Tom;
    //System.out.println(Harry);
    if (Harry != null){
        System.out.println(Harry);
    }
    if (Taylor == null){
        System.out.println(Taylor);
    }else{
        System.out.println(Taylor);
    }
    
    
    System.out.println(Jill.compareTo(Taylor));
    System.out.println(Jill.compareTo(Tom));
    
    System.out.println(Student.getPop());
    System.out.println(Tom.getSchool());

    




}//end of main
}
