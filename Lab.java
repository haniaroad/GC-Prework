package lab1;
import java.util.Scanner;

class Lab {
	  	public static void main(String[] args) {
	  	
	  		        int count = 0, userNum3;  //Get two 3 Digit numbers from user
	  		        
	  		        
	  		         Scanner sc = new Scanner(System.in);
	  		         System.out.println("Enter a 3 digit number: ");
	  		         
	  		                int userNum1 = sc.nextInt();
	  		                
	  		                 System.out.println("Enter a second 3 digit number:");
	  		                 
	  		                int userNum2 = sc.nextInt();
	  		                userNum3 = userNum1;
	  		               
	  		                 while (userNum3 != 0) {
	  		                 userNum3 = userNum3 / 10;
	  		                 ++count;
	  		                 }
	  		                
	  		                Myfunc(userNum1,userNum2,count);
	  		                
	  		    }
	  		    
	  		     public static void Myfunc(int a,int b,int n) {
	  		         
	  		          int outPut1,outPut2;
	  		          int[] digit = new int[3];
	  		          outPut1 = a;
	  		          outPut2 =b;
	  		        
	  		     
	  		     
	  		       while ((a>0) & (b >0)) 
	  		      {
	  		        for(int i=0;i<n;i++) //Iterate through each number one by one
	  		        {
	  		        digit[i] = (a % 10)+(b%10);
	  		        a /= 10; 
	  		        b /= 10;
	  		         }
	  		        }
	  		      //Validate that each numbers' place equals the following one   
	  		      if((digit[0]== digit[1])&&(digit[1]==digit[2])&&(digit[2]==digit[0]))
	  		      {
	  		        System.out.println("True ");  
	  		     }
	  		      else
	  		      {
	  		         System.out.println("False");
	  		       }
	  		     }
	  		}

