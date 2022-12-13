
/**
 * Katie Wang 
 * Bavya
 */
public class Reigster
{
    // instance variables - replace the example below with your own
    private static double totalSales;
    private static double priceByPiece = 0.05;
    private static double priceByWeight = 1.00;
    private static int totalPiecesSold;
    private int pieces;
    private double weight;
    private double money;
    
    /**
     * 
     * 
     */
    public Reigster (int pieces){
        //for price by number of pieces
        this.pieces = pieces;    
        totalPiecesSold += pieces;
        
        
    }
    
    public Reigster (double weight){
        this.weight = weight;
        totalPiecesSold += (int) 1/20 * (int)weight;    
        
        
    }
    

    
    
    
}
