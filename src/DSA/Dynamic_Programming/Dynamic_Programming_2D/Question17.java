package DSA.Dynamic_Programming.Dynamic_Programming_2D;
//Unbounded Knapsack Problem
public class Question17 {
    public static int profit(int i,int []wt, int[]val, int C,int[][]dp){
        if(i == wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1,wt,val,C,dp);
        if(wt[i] > C ) return dp[i][C] = skip;
        int pick = val[i] + profit(i,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick, skip);
    }
    static void main(String[] args) {
        int []val = {5,3,9,16};
        int []wt = {1,2,8,10};
        int C = 8;//capacity
        int n = wt.length;

        // i = 0 to n-1 | C = C to 0
        int[][] dp = new int[n][C+1];// ye bhi ho sakta hai [c+1][n]
        for(int i = 0; i < n; i++)// aesa karoge to upar bhi aesi hi fill karna
            for(int j = 0; j < C+1; j++) dp[i][j] = -1;// [c+1][n]
        System.out.println(profit(0,wt,val,C,dp));
    }
}
/*
Unbounded Knapsack Problem
Problem Statement:

You are given n items, where each item has a weight and a value. You are also given a knapsack with a maximum capacity W.

Your task is to select items such that:
- Total weight of selected items does not exceed the knapsack capacity.
- Total value (profit) is maximized.
- Each item can be selected unlimited number of times.
 */