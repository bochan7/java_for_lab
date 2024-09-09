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
    }
}

