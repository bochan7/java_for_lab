//find the common greates divisor 
//suppose we enter two integers 4 and 2, their greatest common divisor 2.

public class p8 {
    // Iterative method to return gcd of a and b
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 56, b = 98;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        gcd_Lcm p1 = new gcd_Lcm();

        int final_gcd = p1.gcd(a, b);
        System.out.println(" gcd with other way " + final_gcd);
        p1.Lcm(final_gcd, a, b);

    }
}

class gcd_Lcm{
    //there is another way to calculate gcd and lcm 

    int gcd(int n1,int n2 ){
        while (n1%n2 != 0){
            int remainder = n1%n2;
            n1 = remainder;
            n2 = n1 ;
        }
        return  n1;
    }
    void Lcm(int final_gcd,int n1, int n2){
        System.out.println(" lcm of  " + n2 + " and " + n2 + " is " + (n1*n2)/final_gcd);
    }
}