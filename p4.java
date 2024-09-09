/* this program aims to craate a program for a kid who is learning subtraction 
 * this program randomly generates two single digit integers number 1 and number 2 with 
 * number 1 > number 2 and displays a question such as "what is 9 - 2 " to the student.
 * after the student types the answer in the input dialog box , the program displays a message dialog box 
 * to indicate whether answer is correct or not 
 */
//importing swing library to use dialogue box 
import java.util.Random;
import javax.swing.JOptionPane;

public class p4{
    public static void main(String []  args ){
    Random r = new Random();
    int num1 = r.nextInt(10);
    int num2 = r.nextInt(10);
    //num1 shld be gr8er than num2 
    //swaping num1 nad num 2 if num 2 > num 1 
    if(num2 > num1){
        int temp;
        temp = num2;
        num2 = num1;
        num1 = num2;
    }
    int correct_answer = num1 - num2;
    // displaying the pane to do subtraction 
    String ans = JOptionPane.showInputDialog("what will be  " + num1 + " - " + num2 +" ?");
     int final_ans= Integer.parseInt(ans);
     if(final_ans == correct_answer){
        JOptionPane.showMessageDialog(null, "right answer ");
     }
     else{
        JOptionPane.showMessageDialog(null, "oops !! try again ");
     }
    }
}