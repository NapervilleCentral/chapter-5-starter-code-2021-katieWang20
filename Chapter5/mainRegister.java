
/**
 * Register menu
 * 
*/

import java.util.Scanner;

public class mainRegister
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        
        // menu
        //buy candy by piece or by candy by weight
        Scanner input = new Scanner(System.in);
        int candyAmount;
        double candyWeight;
        System.out.println("1. Buy candy by piece\n2. Buy candy by weight\n3. Exit");
        int choice = input.nextInt();
        
        if (choice == 1){
            System.out.println("Enter amount of pieces of candy: ");
            candyAmount = input.nextInt();
            //setter
        }else if (choice == 2){
            System.out.println("Enter the weight of the candy: ");
            candyWeight = input.nextDouble();
            
        }else if (choice == 3){
            System.out.println();
        }else{
            //if choice is invalid, keep looping
            System.out.println("Not a valid choice.\n");
            while (choice < 1 || choice > 3){
                System.out.println("1. Buy candy by piece\n2. Buy candy by weight\n3. Exit");
                choice = input.nextInt();
            }
            
        }
        
        
        
    
    }
}
