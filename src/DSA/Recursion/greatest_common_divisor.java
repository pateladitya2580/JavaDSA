package DSA.Recursion;
import java.util.Scanner;
// calculate greatest common divisor of two numbers
public class greatest_common_divisor {//HCF
    public static int hcf(int n,int m){
        for (int i = Math.min(n,m); i > 1; i--) {
            if(n%i == 0 && m%i == 0){
                return i;
            }
        }
        return 1;
    }
    public static int gcd(int n,int m){
        if(m%n == 0) return n;
        return gcd(m%n,n);
        /*
        b % a
        agar b < a  → answer = b
        agar b >= a → normal remainder
         */
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int n = sc.nextInt();//20
        System.out.println("Enter the second no.");
        int m = sc.nextInt();//64
       // System.out.println("The HCF is "+hcf(n,m));
        System.out.println("The HCF is "+gcd(n,m));//4
    }
}
