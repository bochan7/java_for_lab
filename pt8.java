// to print the following pattern 
// A
// A B
// A B C
// A B C D
// A B C D E 



public class pt8 {
    public static void main (String [] args ){
        char s = 'A';
        for(int i=0;i<6;i++){
            for(int j =0;j<=i;j++){
                System.out.print(s);
                
            }
            s++;
            System.out.println();
        }
    }
}
