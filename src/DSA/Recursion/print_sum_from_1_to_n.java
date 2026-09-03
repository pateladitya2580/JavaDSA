package DSA.Recursion;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class print_sum_from_1_to_n {
    public static void sum(int n,int x){//(parameterised)
        //sum from 1 to n
       if(n == 0){//base case
           System.out.println(x);
           return;
       }
       sum(n-1,x+n);// call and work
    }
    public static int addition(int n ){//(not parameterised)
        if(n == 1|| n == 0 ) return n;
        int k = n + addition(n-1);
        return k;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.till that you find sum ");
        int n = sc.nextInt();
        sum(n,0);
        System.out.println();
        int ans = addition(n);
        System.out.println(ans);
    }
}
