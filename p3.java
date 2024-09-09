/*write a program that prompts the user to enter an integer. if the number is a multiple of 5 
 ,print Hifive. if the number is divisible by2 print hiEven.

*/
import java.util.Scanner;

public class p3 {

    public static void main(String [] args ){
        int number;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter random number of ur choice ");
        number = x.nextInt();

        if(number % 5 == 0){
            System.out.println("Hi five !! ");
        }
         if(number % 2 == 0){
            System.out.println("Hi even ");
            }
        else{
            System.out.println("entered number is neither multiple of 5 nor multiple of 2");
        }
  
    }
}
