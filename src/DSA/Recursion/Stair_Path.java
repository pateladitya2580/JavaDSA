package DSA.Recursion;
import java.util.Scanner;
/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct
ways can you climb to the top?

find no. of ways to reach nth stair if 1 or 2 jump at a time is allowed
ex n = 5, ways = 8
 */
public class Stair_Path {
    public static int strPath(int n){
        if(n == 1 ) return 1;// base case
        else if (n == 2) return 2;// 1 1 ,2 do solution hai isliye// base case
        return strPath(n-1) + strPath(n-2);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stair no.");
        int n = sc.nextInt();
        System.out.println("Ans is "+strPath(n));
    }
}
