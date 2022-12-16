
/**
 * Register menu
 * 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class mainRegister
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        
        // menu
        //buy candy by piece or by candy by weight
        Scanner input = new Scanner(System.in);
        int candyAmount = 0; 
        double candyWeight = 0.00;
        int choice = 0;
        DecimalFormat fmt = new DecimalFormat("#.##");
        
                
        Register pieceRegister;
        Register weightRegister;
        
        while (choice != 3){
            System.out.println("1. Buy candy by piece\n2. Buy candy by weight\n3. Exit");
            choice = input.nextInt();
            if (choice == 1){
                System.out.println("\nEnter amount of pieces of candy: ");
                candyAmount = input.nextInt();
                
                pieceRegister = new Register(candyAmount);
                pieceRegister.setkey(1234);
                pieceRegister.unlock(1111);
                pieceRegister.unlock(1234);
                pieceRegister.takeMoney(choice);
                System.out.println("Sales made by piece register: $" + fmt.format(pieceRegister.getPieceRegisterSales()));
                System.out.println(pieceRegister);    
                
                
            }else if (choice == 2){
                System.out.println("\nEnter the weight of the candy: ");
                candyWeight = input.nextDouble();
                weightRegister = new Register(candyWeight);
                weightRegister.setkey(1234);
                weightRegister.unlock(1111);
                weightRegister.unlock(1234);
                weightRegister.takeMoney(choice);
                System.out.println("Sales made by weight register: $" + fmt.format(weightRegister.getWeightRegisterSales()));
                System.out.println(weightRegister);
                
                
            }else if (choice == 3){
                System.out.println();
                
            }else{
                //if choice is invalid, keep looping
                System.out.println("Not a valid choice.\n");
                //while (choice < 1 || choice > 3){
                    //System.out.println("1. Buy candy by piece\n2. Buy candy by weight\n3. Exit");
                    //choice = input.nextInt();
                
                
            }
        
            System.out.println();
        }
        
        
        
    
    }
}
