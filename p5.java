// here is a program that checks whether a number is divisible by 2 and 3 , whether a number is divisibel by 
// 2 or 3 and whether a number is divisble by 2 or 3 not both 
import java.util.Scanner;
public class p5{
    public static void main(String [] args){
     int num;
     System.out.println("enter the number ");
     Scanner x = new Scanner(System.in);
     num = x.nextInt();
   
     if(num % 2 == 0 && num % 3 == 0){
       System.out.println("entered number :" + num + " is divsible by both 2 and 3");
     }
     if( num %2 == 0 || num%3 == 0){
        System.out.println("entered number :" + num + " is divsible by 2 or 3");
     }
     if( num %2 == 0 ^ num%3 == 0){
        System.out.println("entered number :" + num + " is divsible by 2 or 3 but not by both ");
     }
    }
}
