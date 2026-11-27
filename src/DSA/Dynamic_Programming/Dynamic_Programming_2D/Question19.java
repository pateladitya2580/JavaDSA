package DSA.Dynamic_Programming.Dynamic_Programming_2D;
import java.util.List;
//LeetCode 494 Target Sum (0/1 knapsack )
public class Question19 {
    class Solution {
        static int sum ;
        public int ways (int i , int[]arr,int res, int target,int[][]dp){
            if(i == arr.length) {
                if(res == target) return 1; // 1 valid way
                else return 0;
            }
            if(dp[i][res + sum] != -1) return dp[i][res+sum];
            int add = ways(i+1,arr,res+arr[i],target,dp);
            int sub = ways(i+1,arr,res-arr[i],target,dp);
            return dp[i][res+sum] = add+sub;
        }
        public int findTargetSumWays(int[] arr, int target) {
            // i -> 0 to n-1 | res = -sum to sum
            //dp[i][res + sum] -> ways(i,res)
            sum = 0;int n = arr.length;
            for(int ele:arr) sum+= ele;
            int[][] dp = new int[n][2*sum+1];
            for(int i = 0;i<dp.length;i++)
                for(int j = 0;j<dp[0].length;j++) dp[i][j] = -1;
            return ways(0,arr,0,target,dp);
        }
    }
    static void main(String[] args) {

    }
}
/*
hai, yahan ek important concept hai: res negative bhi ho sakta hai,
isliye hum sum ko offset (shift) ki tarah use kar rahe hain.
 */