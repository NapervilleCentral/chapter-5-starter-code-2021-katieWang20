
/**
 * Katie Wang 
 * Bavya
 * 
 */
import java.util.Scanner;

public class Register implements lockable
{
    // instance variables - replace the example below with your own
    private static double totalSales, totalWeight;
    private final double priceByPiece = 0.05;
    private final double priceByWeight = 1.00;
    private static int totalPiecesSold;
    
    private Scanner input = new Scanner(System.in);
    private int pieces;
    private double weight;
    private double price;
    
    private int key; 
    private boolean locked = true;
    
    /**
     * @param int number of pieces
     * 
     */
    
    public Register (int pieces){
        //for price by number of pieces
        this.pieces = pieces;    
        //totalPiecesSold += pieces;          
        price = pieces * 0.05;
        totalSales +=price;
        
    }
    /**
     * @param double weight
     * 1 dollar per pound
     * 
     */
    
    public Register (double weight){
        this.weight = weight;
        totalWeight += weight;
        pieces = (int) ((double)1/20 * weight);    
        price = weight * 1.00;
        totalSales +=price;
        
    }
    
    public void setkey (int pass){
        key = pass;
    
    } //use 1234 for convenience
    
    public void lock ( int locker){
        if (locker == key){
            locked = true;
        }
    }
    
    public void unlock(int unlocker){
        if (unlocker == key){
            locked = false;
        }
    }
    public boolean locked (){
        return locked;
    }
    
    public double getTotalWeight(){
        return totalWeight;
    }
    
    public int getTotalNumOfPieces(){
        return totalPiecesSold;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getTotalSales(){
        return totalSales;
    }
    
   
    
    public int getTotalPieces(){
        return totalPiecesSold;
    }
    
    public double takeMoney(int choice){
        double change = 0;
        int money;  
        System.out.println("The price is: " + price);
        System.out.println("Enter amount of money: ");
        money = input.nextInt();
        
        if (money > price){
            change = money - price;
            System.out.printf("The change is %.2f" + change);
            System.out.println();
            totalPiecesSold += pieces;          
            totalSales +=price;
            
            if (choice == 2){
                totalWeight += weight;
            }
        }else if (money < price){
            System.out.println("Not enough money. You are poor!");
            
        }else{
            System.out.println("Paid. No change");
            totalPiecesSold += pieces;  
            totalSales +=price;
            
            if (choice == 2){
                totalWeight += weight;
            }
            
        }
        
                
        return change;
    
    }
    
    public String toString(){
        String stuff = "";
        stuff += "Total sales: " + getTotalSales() +"\n";
        stuff += "Total pieces sold: "+ getTotalPieces() + "\n";
        stuff += "Total weight sold: " + getTotalWeight();
        
        return stuff;
    }
    
    
    
}
