package lab1;
import java.util.Scanner;

class Lab {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int MAX_LENGTH = 3; 
    final int MIN_LENGTH = 3;
    int num1 = 0;

    System.out.print("Please enter a 3-digit number: ");
    
    scanner: //Validate
    while(scanner.hasNext()) {
      if(scanner.hasNextInt()){
        num1 = scanner.nextInt();
        if(String.valueOf(num1).length() < MAX_LENGTH) { //Limit to 3 digits
        System.out.println("Not vailid entry. Please enter 3 digit number: ");
        	scanner.next();
        } 
      } 
       
      
    }
    
  }
}
