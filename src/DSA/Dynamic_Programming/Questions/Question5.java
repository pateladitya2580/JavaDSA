package DSA.Dynamic_Programming.Questions;

import java.util.Arrays;

//LeetCode 198 House Robber problem by (Recursion + Memoization)
public class Question5 {
    class Solution {
        public int amount(int[] nums,int i,int []dp) {
            if(i>= nums.length) return 0;
            if(dp[i] != -1) return dp[i];
            int take = nums[i] + amount(nums,i+2,dp);
            int skip = amount(nums,i+1,dp);
            return dp[i] = Math.max(take,skip);
        }
        public int rob(int[] nums) {
            //'i' varies from 0 to n-1
            //dp[i] will store the value of amount(i)
            int n = nums.length;
            int[] dp = new int[n];
            Arrays.fill(dp,-1);
            return amount(nums,0,dp);
        }
    }
    static void main(String[] args) {

    }
}
