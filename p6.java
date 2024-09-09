//this program aims to generate a random number and asks the user to guess it on the basis of guess work 
//it tell if the guess is too low or too high 
import java.util.Random;
import java.util.Scanner;

public class p6 {
    public static void main(String [] args){
        Random x =  new Random();
        int y = x.nextInt(100);
        System.out.println(y); 
        int guess;
        Scanner z = new Scanner(System.in);
        do{
        System.out.println("enter ur guess ");
        guess = z.nextInt();
        
        if(guess == y){
            System.out.println("yeah !! u guesed it right ");
        }
        else if( guess < y ){
            System.out.println(" u guessd low ");
        }
        else {
            System.out.println(" u guess too high ");
        }
    } while(guess != y);
    } 
}
