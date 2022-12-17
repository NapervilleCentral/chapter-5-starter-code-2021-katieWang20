import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Register pieceRegister = new Register ("p", 0000);
    pieceRegister.setkey(1234);

    //pieceRegister.unlock(1232);
    
    
    
    Register weightRegister = new Register("w", 0000);
    weightRegister.setkey(1234);    
    Scanner input = new Scanner(System.in);

    
    System.out.println("Make a selection");
    String choice = "";
    
    while (! choice.equals("z")){
        System.out.println();
      System.out.println("p) Buy candy on # of pieces");
      System.out.println("w) Buy candy on weight."); 
      System.out.println("x) Lock or unlock register."); 
      System.out.println("s) Display sales for the day");
      System.out.println("q) display sales for the day and close store");
      System.out.println("Press z key to exit.");
      choice = input.nextLine();
      
      if (choice.equals("p")){
        System.out.println("enter amount of pieces: ");
        int pieces = input.nextInt();
        pieceRegister.setPieces(pieces);
        pieceRegister.takeMoney(choice);
          input.nextLine();
      }else if (choice.equals("w")){
        System.out.println("enter weight: ");
        double weight = input.nextDouble();
        weightRegister.setWeight(weight);
        weightRegister.setPieces(weight);
        weightRegister.takeMoney(choice);
        input.nextLine();
      }else if (choice.equals("z")){
          
         System.out.println();
        
      }else if (choice.equals("x")){
          int enter;
            if (weightRegister.locked()){
            System.out.println("Enter 4-digit pin to unlock weight register");
            enter = input.nextInt();
            weightRegister.unlock(enter);
        }else{
                System.out.println("already unlocked");
        }
        
        if (pieceRegister.locked()){
            System.out.println("Enter 4-digit pin to unlock piece register");
            enter = input.nextInt();
            pieceRegister.unlock(enter);
        }else{
                System.out.println("already unlocked");
        }
        
           
     
     }else if (choice.equals("s")){
            System.out.println("Sales for the day");
            System.out.println("Piece Register: \n");
            pieceRegister.getDailySales();
            
            System.out.println("Weight Register : \n");
            weightRegister.getDailySales();
            //input.nextLine();
      }else if (choice.equals("q")){
            System.out.println("Sales for the day");
            System.out.println("Piece Register: \n");
            pieceRegister.getDailySales();
            
            System.out.println("Weight Register : \n");
            weightRegister.getDailySales();
            System.out.println();
            System.out.println(pieceRegister);
            
            pieceRegister.lock(1234);
            weightRegister.lock(1234);
            
      }else{
         System.out.println("invalid\n");
         //input.nextLine();
      }
       // nexLine in soem statements so it doesnt automatically skip the input nextLine at the top and automatically make the condition invalid IDK why it does that took a long time fixing it
      
    //pieceRegister.setPieces(12);
    //pieceRegister.setPieces(100);
      
    }
    
    //System.out.println("\nMake a choice");
    
    //System.out.println();
    
    
    
    
   // System.out.println(pieceRegister);
   // System.out.println(weightRegister);
    //pieceRegister.lock(1234);
    //weightRegister.lock(1234);
    
    
    
    
    //if (choice == 'p'):
      //pieceRegister.set
    
  }
}