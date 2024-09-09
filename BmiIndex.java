/*body measure index is a measure of health on weight It can be calculated by taking our weight 
 * in kg and dividing by the sqaure of your height in meters. the interpretation of BMI for people 
 * 16 years or older is as follows 
 * BMI                   INTERRETATION 
 * 
 * below 16              serious underweight
 * 16 - 18               underweight 
 * 18-24                 normal weight 
 * 24 - 29               overweight 
 * 29 - 35               seriously overweight 
 * above 35              gravely overweight 
 *  
 */
import java.util.Scanner;

 public class BmiIndex{
    public static void main(String [] args ){
        float weight,height;
        Scanner x = new Scanner(System.in);
        System.out.println("enter ur weight in kg ");
        weight = x.nextFloat();
        System.out.println("enter ur height in mtr ");
        height = x.nextFloat();
        float BMI = weight/(height*height);
        System.out.println("// " + BMI);
        
        if(BMI < 16 ){
            System.out.println("serious underweight ");
        }
       else if(BMI >= 16 && BMI < 18 ){
            System.out.println(" underweight ");
        }
       else if(BMI >= 18 && BMI < 24  ){
            System.out.println(" normal weight ");
        }
       else if(BMI >= 24 && BMI < 29  ){
            System.out.println("overweight ");
        }
       else if(BMI >= 29 && BMI < 35  ){
            System.out.println("seriously overweight ");
        }
       else if(BMI >=35 ){
            System.out.println("gravely overweight ");
        }
    }
 }
