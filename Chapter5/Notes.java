
/**
 * Write a description of class Notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Notes
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main (String[] args){
        mathy solver = new mathy();
        solver.abs(-5);
        System.out.println(mathy.PI);
        double num = mathy.round(3.34234324324, 2);
        //call straight from class level
        System.out.println(num);
        
        Account one = new Account("Me", 1001, 1000);
        Account two = new Account("You", 2001, 2000);
        Account three = new Account("Them", 3001, 3000);
        Account four = new Account("Us", 4001, 4000);
        
        Account[] bank = {three, one, four, two}; //calls compareTo and sorts by account Number
        
        Sorts.insertionSort(bank);
        
        for (Account a : bank){
            System.out.println(a);
        }
        
    }
}
