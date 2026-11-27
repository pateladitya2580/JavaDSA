package DSA.Dynamic_Programming.Dynamic_Programming_2D;
//LeetCode 322 Coin Change
public class Question18 {
    class Solution {
        public long coinCount(int i, int[] coins,int amount, long[][] dp) {
            if(i == coins.length) {
                if(amount == 0 ) return 0;// no more coins needed
                else return Integer.MAX_VALUE;// not a valid combination
            }
            if(dp[i][amount] != -1) return dp[i][amount];
            long skip = coinCount(i+1,coins,amount,dp);
            if(amount - coins[i] <  0) return skip;
            long pick = 1 + coinCount(i,coins,amount-coins[i],dp);
            return  dp[i][amount] = Math.min(skip,pick);
        }
        public int coinChange(int[] coins, int amount) {
            // i = 0 to n-1 | amount = amount to 0
            long[][] dp = new long[coins.length+1][amount+1];
            for(int i = 0; i < dp.length; i++)
                for (int j = 0; j < dp[0].length ; j++) {
                    dp[i][j] = -1;
                }
            int ans = (int)coinCount(0,coins,amount,dp);
            if(ans == Integer.MAX_VALUE) return -1;
            return ans;
        }
    }

    static void main(String[] args) {

    }
}
/*
// Knapsack general code :

if (amt - arr[i] < 0) {
    skip; // move to 'i + 1'
}
else {
    skip & pick; // for pick: stay at 'i' in unbounded, or move to 'i + 1' in 0/1
    skip and pick conditin ke hisab se ham kabhi mimimum ya maximum ,or, and
    use karte hai
}
 */