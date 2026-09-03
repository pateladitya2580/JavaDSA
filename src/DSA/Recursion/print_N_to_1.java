package DSA.Recursion;
import java.util.Scanner;

public class print_N_to_1 {
    public static void Print(int n ){// n to 1 //
        if(n == 0) return;// base case
        System.out.print(n + " ");// work
        Print(n-1);// call
    }
    public static void print(int n ){// 1 to n //
        if(n==0) return;//base case
        print(n-1);//call
        System.out.print(n + " ");//work
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n ");
        int n = sc.nextInt();
        Print(n);
        System.out.println();
        print(n);
    }
}
