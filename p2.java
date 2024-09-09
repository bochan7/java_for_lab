/*this example creates a problem to let a first grader practice additions. this program randomly genereates 
two single digit integers number 1 and number 2 and displays a question such as "what is the 7+9 ?" to the student
after the student types the answer , the program displays a message to indicate whether the answer is true or false 
*/
import java.util.Random;
import java.util.Scanner;

public class p2 {
  public static void main(String [] args ){
    //initialization 
    int number1,number2,result;
    //making instance of random function and nameing it rand , it can be named anything btw 
    Random rand = new Random();
     
     //using random function to generate two single digit random number 

     number1 = rand.nextInt(10);
     number2 = rand.nextInt(10);

     result = number1 + number2;

     int answer;

     Scanner x = new Scanner(System.in);

     System.out.println("what is " + number1 + " + " + number2 + " ??");
     do{
     answer = x.nextInt();

     if(answer == result){
        System.out.println("kudos !! \n ur answer is right ");
     }
     else{
        System.out.println("oops !! try again ");
     }
    }while(answer != result);

  }  
}
