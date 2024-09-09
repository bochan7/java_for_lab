//computing area of circle 
//but the program should filter out negative radius value 
//we r making this program according to the topics covered in class 
//so no OOPS methodology will be impleted as it is not yet discussed 

import java.util.Scanner;

public class p1{
 
 public static void main(String [] args){ 
 //initializing variable to hold value of radius 
 double radius;
 Scanner x = new Scanner(System.in);
  System.out.println("enter the radius of circle to calculate its area ");
  radius = x.nextDouble();

  //applying check to filter out -ve value of radius 

  if(radius < 0 ){
    System.out.println("value of radius can't be -ve ");
  }
  else{
    double area = 3.14*radius*radius;
    System.out.println("area of the circle with radius " + radius + " is " + area);
  }
 }
 
}