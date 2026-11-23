package DSA.Dynamic_Programming.Questions;
//Fibonacci number(recursion + Memoization)
//LeetCode 509. Fibonacci Number
public class Question1 {
    class Solution {
        static int[] dp;
        public int fibo(int n,int[] dp ){
            if(n<= 1) return n;
            if(dp[n]!=0) return dp[n];
            return dp[n]  =  fibo(n-1,dp) + fibo(n-2,dp);
            // phle dp array me gaya, phir dp[n] return hua

        }
        public int fib(int n) {

            int[]dp = new int[n+1];// index from 0 to n
            return fibo(n,dp);
        }
    }
    static void main(String[] args) {

    }
}
//(recursion + Memoization) -> It is known as Top-Down DP