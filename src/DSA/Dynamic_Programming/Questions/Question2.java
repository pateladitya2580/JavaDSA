package DSA.Dynamic_Programming.Questions;
//Fibonacci number(Tabulation ) Bottom - up Dp = iterative DP
public class Question2 {
    class Solution {
        public int fib(int n) {
            if(n<= 1) return n;
            int[]dp = new int[n+1];
            dp[0]= 0; dp[1] = 1;
            for(int i = 2;i<=n;i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }
    static void main(String[] args) {

    }
}
//Dp -> using previous results to compete new result
//jaha par recursion lag raha hai -> Memoization ( Top-Down DP)
//jaha for loop lag raha hai recursion nahi lag rahi hai -> Tabulation( Bottom to up DP)
