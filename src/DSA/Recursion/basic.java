package DSA.Recursion;
import java.util.Scanner;
/*
Recursion ek programming technique hai jisme ek function apne aap ko
repeatedly call karta hai, jab tak ek condition (Base Case) satisfy
nahi ho jaati.
 */
public class basic {
    public static int factorial(int n){
        if(n == 1 || n == 0) return 1;//base case
        int f = n * factorial(n-1);//call
        return f;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no that you want a factorial ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println("The factorial is "+ f);
    }
}
