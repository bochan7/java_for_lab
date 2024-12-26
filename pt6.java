// to print a pattern 
//
// 1             1
// 1 2         2 1 
// 1 2 3     3 2 1
// 1 2 3 4 4 3 2 1  
//


public class pt6 {
    public static void main(String [] args ){

    
    for(int i=0;i<4;i++){
           for(int j=0;j<8;j++){
            if(i>=j || i+j >= 7){
                if(j<=3){
                System.out.print(j+1);
                }
                else{
                    System.out.print(8-j);
                }
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println( );
    
    }
    }
}