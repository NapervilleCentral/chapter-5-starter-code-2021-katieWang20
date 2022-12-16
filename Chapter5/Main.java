import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Register pieceRegister = new Register ("p", 0000);
    pieceRegister.setkey(1234);

    pieceRegister.unlock(1234);

    
    Register weightRegister = new Register("w", 1234);
    
    Scanner input = new Scanner(System.in);

    
    System.out.println("Make a selection");
    String choice = "";
    
    while (! choice.equals("z")){
      System.out.println("p) Buy candy on # of pieces \nw) Buy candy on weight. Press z key to exit.");
      choice = input.nextLine();
      
      if (choice.equals("p")){
        System.out.println("enter amount of pieces: ");
        int pieces = input.nextInt();
        pieceRegister.setPieces(pieces);
        pieceRegister.takeMoney(choice);
          
      }else if (choice.equals("w")){
        System.out.println("enter weight: ");
        double weight = input.nextDouble();
        weightRegister.setWeight(weight);
        weightRegister.setPieces(weight);
        weightRegister.takeMoney(choice);
        
      }else if (choice.equals("z")){
        System.out.println();
        
      }else{
         System.out.println("invalid");
         
      }
    //pieceRegister.setPieces(12);
    //pieceRegister.setPieces(100);
      
    }
    
    System.out.println("\nMake a choice");
    
    
    System.out.println(pieceRegister);
    System.out.println(weightRegister);
    pieceRegister.lock(1234);
    weightRegister.lock(1234);
    
    
    
    
    //if (choice == 'p'):
      //pieceRegister.set
    
  }
}