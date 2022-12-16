
/**
 * Katie Wang 
 * Bavya
 * 
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class RegisterOOF implements lockable
{
    // instance variables - replace the example below with your own
    private static double totalSales, totalWeight, weightRegisterSales, pieceRegisterSales;
    private final double priceByPiece = 0.05;
    private final double priceByWeight = 1.00;
    private static int totalPiecesSold; //includes both pieces by pieces and approximate pieces by weight
    private DecimalFormat fmt = new DecimalFormat("0.00");
    private Scanner input = new Scanner(System.in);
    private int pieces;
    private double weight;
    private double price;
    
    private int key; 
    private boolean locked = true;
    
    /**
     * @param int number of pieces
     * 0.05 cents per piece 
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
    
    public double getWeightRegisterSales(){
        return weightRegisterSales;
    }
    
    public double getPieceRegisterSales(){
        return pieceRegisterSales;
    }
    
    public int getTotalPieces(){
        return totalPiecesSold;
    }
    /**
     * absolute value thing because doubles are not 100% doubles because of that .000000000000001
     * How will this effect the global economy
     * 
     * @param choice 
     * so that it can decide which register to add their sales to
     * 
     */
    public double takeMoney(int choice){
        
        double change = 0;
        double money;  
        
        if (locked == true){
            System.out.println("Access to Register machine denied");
            return 0;
        }else{
        
            System.out.println("The price is: $" + fmt.format(price));
            System.out.println("Enter amount of money: ");
            money = input.nextDouble();
            
            
        
            if (money - price > 0 || Math.abs(money-price) <=0.0001 ){
                    if (Math.abs(money-price) <=0.0001){
                        change = 0;
                    }else{
                    change = money - price;
                    }
                    System.out.println("The change is $" + fmt.format(change));
                    System.out.println();
                    totalPiecesSold += pieces;          
                    totalSales +=price;
                    
                    if (choice == 2){
                        totalWeight += weight;
                        weightRegisterSales += price;
                    }else{
                        pieceRegisterSales +=price;
                    }
            }else{
                    System.out.println("Not enough money. You are poor!");
                    
                
            
            }        
            return change;
    
        
        }
    }
    
    public String toString(){
        String stuff = "";
        
        stuff += "Total sales: $" + fmt.format(getTotalSales()) +"\n";
        stuff += "Total pieces sold: $"+ getTotalPieces() + "\n";
        stuff += "Total weight sold: $" + fmt.format(getTotalWeight());
        
        if (locked)
            return "locked, please unlock first";
        else
            return stuff;
    }
    
    
    
}
