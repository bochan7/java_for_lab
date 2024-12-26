// to print this pattern 
// *
// * * 
// * * *
// * * * * 
// * * * * *


public class pt2 {
    public static void main(String [] args ){
     for(int i=0;i<5;i++){
        for(int j = 5-i ; j > 0 ;j --){
            System.out.print( 6-j-i  );
        }
        System.out.println( " ");
     }
  
 

    }
}
