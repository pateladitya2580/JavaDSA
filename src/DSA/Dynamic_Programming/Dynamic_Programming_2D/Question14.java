package DSA.Dynamic_Programming.Dynamic_Programming_2D;
// 0/1 Knapsack problem
public class Question14 {
    public static int profit(int i,int []wt, int[]val, int C,int[][]dp){
        if(i == wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1,wt,val,C,dp);
        if(wt[i] > C ) return dp[i][C] = skip;
        int pick = val[i] + profit(i+1,wt,val,C-wt[i],dp);
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
# 0/1 Knapsack Problem

## Problem Statement

Maan lo tumhare paas ek bag hai jiski maximum capacity **7 kg** hai.
Tumhare paas kuch items hain, aur har item ka apna **weight** aur **value
** hai.

Tumhe in items mein se kuch items select karke bag mein rakhne hain, taaki
bag ki capacity exceed na ho aur selected items ki total value maximum ho.

### Rules:
- Bag ka total weight uski maximum capacity se zyada nahi hona chahiye.
- Humein selected items ki total value maximum karni hai.
- Har item ko ya toh **select (1)** kar sakte hain ya **reject (0)** kar sakte hain.
- Ek item ko maximum **ek baar** hi select kar sakte hain; us item ko dobara nahi le sakte.

### Example:

Bag Capacity = **7 kg**

| Item | Weight | Value |
|---|---:|---:|
| A | 1 kg | 1 |
| B | 3 kg | 4 |
| C | 4 kg | 5 |
| D | 5 kg | 7 |

**Objective:** Items ko aise select karna hai ki total weight 7 kg se zyada na ho aur total value maximum ho.

### Meaning of 0/1:
- **0 →** Item ko select nahi karna.
- **1 →** Item ko select karna.

Is problem mein har item ke paas sirf 2 choices hoti hain: select karna ya skip karna.

 */