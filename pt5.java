// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1


public class pt5 {
    public static void main(String [] args ){
        int flag = 0;
        
        for(int i=0;i<7;i++){
            if(i%2 == 0){
                flag = 0;
            }
            else{
                flag = 1;
            }
            for(int j=0;j<i;j++){
                if(flag == 1 ){
                    System.out.print( flag);
                    flag = 0;
                }
                else{
                    System.out.print(flag);
                    flag =1;
                }
            }
           
            System.out.println( );
        }
    }
}
