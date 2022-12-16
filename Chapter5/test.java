
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class test
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        int x;
        
        Scanner input = new Scanner (System.in);
        int num = 0;
        int prevNum = 0;
        int HighestNum = 0;
        
        for (int a = 0; a < 10; a++){
            System.out.println("Enter an integer: ");
            num = input.nextInt();
            prevNum = num;
        
            if (num > prevNum){
        	HighestNum = num;
        
        
            }
        
           
        }
        
        System.out.println(HighestNum);
    }
}
