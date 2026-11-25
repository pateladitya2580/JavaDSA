package DSA.Dynamic_Programming.Questions;

import java.util.Arrays;

//LeetCode 279 Perfect Squares ( 1DP Problem )
public class Question13 {
    class Solution {

        // Check karte hain ki n perfect square hai ya nahi
        public boolean isPerfect(int n) {
            int sqrt = (int)(Math.sqrt(n));

            // Agar sqrt * sqrt == n hai, toh n perfect square hai
            return sqrt * sqrt == n;
        }

        // Memoization function: n ko represent karne ke liye
        // minimum perfect squares ki count find karta hai
        public int minSquares(int n, int[] dp) {

            // Base Case:
            // Agar n khud perfect square hai, toh sirf 1 square sufficient hai
            if (isPerfect(n)) return 1;

            // Agar n ka answer pehle calculate ho chuka hai,
            // toh dobara recursion chalane ki jagah dp se return kar do
            if (dp[n] != -1) return dp[n];

            // Minimum answer find karne ke liye initially maximum value rakhi
            int min = Integer.MAX_VALUE;

            // Saare possible perfect squares try karenge jo n se chhote ya equal hain
            // i*i <= n ka matlab i ki value sqrt(n) tak hi jayegi
            for (int i = 1; i * i <= n; i++) {

                // Current perfect square (i*i) ko select kiya
                // Ab remaining number (n - i*i) ko recursively solve karenge
                int count = minSquares(i * i, dp) + minSquares(n - i * i, dp);

                // Har possible combination mein se minimum count select karenge
                min = Math.min(min, count);
            }

            // n ka minimum answer dp[n] mein store karenge
            // Taaki future mein same subproblem dobara calculate na ho
            return dp[n] = min;
        }

        // Main function
        public int numSquares(int n) {

            // DP array create kiya, jisme har number ka minimum answer store hoga
            int[] dp = new int[n + 1];

            // Initially sabhi states ko -1 se initialize kiya
            // -1 ka matlab hai ki abhi tak answer calculate nahi hua
            Arrays.fill(dp, -1);

            // Recursion + Memoization start karenge
            return minSquares(n, dp);
        }
    }
    static void main(String[] args) {

    }
}
