/**
 * Katie Wang
 * Bavya 
 * Mr Hayes
 * 
 */
import java.util.Scanner;
import java.text.DecimalFormat;
//implements lockable

public class Register implements lockable 
{
    // instance variables
    //end of the day, these are the combined numbers between the 2 registers
    private static double totalSalesWeight, totalSales;
    private static int totalPiecesSold;

  //sales for ONE register only!
    private double registerSales;
    
    //these store the values for each register type independently
    private static double totalWeight;
    private static int totalPieces;
   
    //these are the remaining class attributes to be initialized by the user
    private int pieces;
    private double weight;
    private double price;
    private String regType;
    private int key;
    private boolean locked = true;
   

    private DecimalFormat fmt = new DecimalFormat("0.00");

    private Scanner input = new Scanner(System.in);
   
    /**
     * @param int number of pieces, int lockPin
     *
     */
   
    public Register (String regType, int lockPin){
        if (regType.equals("p")){
            this.regType = "p";
                 
          
            key = lockPin;
            
        }else if (regType.equals("w")){
            this.regType = "w";
   
            
            key = lockPin;

        
        } else
            System.out.println("Sorry, that is not a valid input");
    }
   
    /**
     * changes the pin/passcode to lock and unlock the register
     * @param int pass
     * @return nothing
     */
    public void setkey (int pass){
        key = pass;
    } //use 1234 for convenience
   
    /**
     * locks the register if the correct password/pin is given
     * @param int locker
     * @return nothing
     */
    public void lock ( int locker){
        if (locker == key){
            locked = true;
            System.out.println("Your register is now locked");
        
        }else{
            System.out.println("Sorry, that is the incorrect key");
        }
    }
   
    /**
     * unlocks the register if the correct password/pin is given
     * @param int unlocker
     * @return nothing
     */
     public String getRegType(){
        return regType;
    }
    
    public void unlock(int unlocker){
        if (unlocker == key){
            System.out.println("Your Register is now unlocked");
            locked = false;
        }else{
            System.out.println("Sorry, that is the incorrect key");
        }
    }
   
    /**
     * finds out if the register is locked or not
     * @param none
     * @return boolean locked
     */
    public boolean locked (){
        return locked;
    }
   
    /**
     * finds out how many pounds of candy the register that takes the amount
     * of candy by weight the user wants to buy has sold
     * @param none
     * @return double totalWeight
     */
    public double getTotalWeight(){
        return totalWeight;
    }
   
    /**
     * finds out how many pieces of candy the piece register has
     * @param none
     * @return int totalPieces
     */
    public int getTotalPieces(){
        return totalPieces;
    }
   
   
    /**
     * finds out how many pices both register have sold together
     * @param none
     * @return int totalPiecesSold
     */
    public int getTotalNumOfPieces(){
        return totalPiecesSold;
    }
   
    /**
     * finds the amount of money that both registers have made together in
     * selling candy
     * @param none
     * @return double totalSales
     */
    public double getTotalSales(){
        return totalSales;
    }
   
    /**
     * finds the price of the amount of candy that the user wants to buy (can
     * be used in both buying candy by weight and by number of pieces)
     * @param none
     * @return double price
     */
    public double getPrice(){
        return price;
    }
    
      public double getTotalSalesWeight(){
        //weight and price are at a 1:1 ratio so getting the weight also
        //gets us the price of this amount of candy
        double allWeight = getTotalWeight() + ((double)getTotalPieces()/20);
        return allWeight;
    }
    
    /**
     * sets the amount of pieces that the user wants to buy
     * @param int newAmount
     * @return nothing
     */
    public void setPieces(int newAmount){
   
        
        pieces = newAmount;
       
        price = pieces * 0.05;
    }


    public void setPieces(double weight){

      pieces =(int)((double)1/20 * (double)weight);
      price = weight * 1.00;

      

    }
   
    /**
     * sets the weight of candy that the user wants to buy
     * @param double newAmount
     * @return nothing
     */
    public void setWeight(double newAmount){

        
        weight = newAmount;
       
    }

    

   

    /**
     * displays what the user wants to buy in weight or number of pieces, the
     * price of that amount of candy, asks the user for payment, and displays
     * the amount of change being given back to the user
     * @param String buyingMethod
     * @return nothing
     */
    public void takeMoney(String buyingMethod){
        double change = 0;


        if (regType.equals("p"))
            System.out.println("You want to buy " + pieces + " pieces of candy");
        else if (regType.equals("w"))
            System.out.println("You want to buy " + weight + " pounds of candy");

        System.out.println("The price is: " + fmt.format(price));
      
        System.out.println("Enter amount of money: ");
      
        double money = input.nextDouble();
        //pieces price ask for money change

        if (locked == true){
          System.out.println("uh oh access denied ");
         
        }else{
            if (money >= price || Math.abs(money - price) <=0.0001){
                if (Math.abs(money - price) <=0.0001)
                    change = 0;
                else
                    change = money - price;
            
                System.out.println("Your change is $" + fmt.format(change));
                System.out.println();
            
              
              
                 if (regType.equals("p")){
                     //setPieces(pieces);
                     weight = (double)pieces * (double)1/20;
                     totalWeight +=weight;
                     
                 } else{
                
                     totalWeight +=weight;
                
                     totalPieces +=pieces;
                
                 }
              totalPiecesSold +=pieces;
              registerSales += price;
              totalSales += price;
            
            }else{
              System.out.println("Not enough money. You are poor!");
            
            
          }
        }

          
       

    }
    
    public void getDailySales(){
            if (locked() == false){
                //System.out.println("Today's sales: \nTotal sales at Pieces Register:$ " + totalPieces);
                //System.out.println("\nTotal sales at Weight Register: $" + getTotalWeight());
                if (getRegType().equals("p")){
                    System.out.println("\nTotal sales at this Pieces Register: $" + fmt.format(registerSales));
                } else {
                    System.out.println("\nTotal sales at this Weight Register: $" + fmt.format(registerSales));
                }
                   
                System.out.println("\nTotal pieces sold today (both): " + getTotalNumOfPieces());
                System.out.println("\nTotal pounds sold today (both): " + fmt.format(getTotalSalesWeight()));
            }else{
                System.out.println("Locked, please unlock first");
            }
    }
        /**
         * compilation of data about the Register object
         * @param none
         * @return String data
         */
    public String toString(){
            String stuff = "";
            stuff += "Total sales overall: $" + fmt.format(getTotalSales()) +"\n";
            stuff += "Total pieces sold overall: "+ getTotalNumOfPieces() + "\n";
            stuff += "Total pounds sold overall: " + fmt.format(getTotalSalesWeight());
           
            return stuff;
    }
}

