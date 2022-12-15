
/**
 * Katie Wang 
 * Bavya
 * 
 */
import java.util.Scanner;

public class Reigster implements lockable
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
    
    public Reigster (int pieces){
        //for price by number of pieces
        this.pieces = pieces;    
        totalPiecesSold += pieces;          
        price = pieces * 0.05;
        totalSales +=price;
        
    }
    /**
     * @param double weight
     * 1 dollar per pound
     * 
     */
    
    public Reigster (double weight){
        this.weight = weight;
        totalWeight += weight;
        totalPiecesSold += (int) ((double)1/20 * weight);    
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
    
    public double getThatDough(){
        double change = 0;
        int money;
        System.out.println("Enter amount of money: ");
        money = input.nextInt();
        
        if (money > price){
            change = money - price;
        }else if (money < price){
            System.out.println("Not enough money. You are poor!");
            
        }else{
            System.out.println("perfect");
        }
        
        
        return change;
    
    }
    
    
    
    
    
    
}
