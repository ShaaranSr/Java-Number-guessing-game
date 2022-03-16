//number guessing game
import java.lang.Math;
import java.util.Scanner;
//root class personalised
class firstCode{

	//object creation in main function
    public static void main(String[] args) {
    	System.out.println("Welcome to the guessing game ");
    	int a =(int) (Math.random()*10)+1;
    	while(true) {
    		System.out.println(" ");
            Scanner object=new Scanner(System.in);
            System.out.print("enter a no. between 1 to 10: ");
            int b=object.nextInt() ;
            
            if (a==b) {
                System.out.println("you chose it right! Hurray !");
                System.out.println("The computer chose"+" "+a);
                 break;
            }else if (a>b) {
                System.out.println("uggh the no. you chose is smaller. Try it again ;)");
            }else if(a<b) {
                System.out.println("uggh the no. you chose is bigger. Try it again using this hint ;)");
            }
            
    
       }

    }
 }
