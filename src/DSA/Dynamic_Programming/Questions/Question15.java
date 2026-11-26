package DSA.Dynamic_Programming.Questions;
//Problem: Given an array arr and a target value,
//check whether any subset exists whose sum equals the target.
public class Question15 {
    static void main(String[] args) {
        int [] arr = {8,1,2,4};
        int target = 7;
        int n = arr.length;
        // i = 0 to n-1 | target = target to 0
        int [][] dp = new int [n][target+1];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < target+1; j++) dp[i][j] = -1;
        System.out.println(subset(0,arr,target,dp));
    }

    private static boolean subset(int i, int[] arr, int target, int[][] dp) {
        if (i == arr.length) {
            if(target == 0) return true;
            else return false;
        }
        if (dp[i][target] != -1) {
            if(dp[i][target] == 1) return true;
            else return false;
        }
        boolean ans = false;
        boolean skip = subset(i+1,arr,target,dp);
        if(target - arr[i] < 0) ans = skip;
        else{
            boolean pick = subset(i+1,arr,target-arr[i],dp);
            ans =  skip || pick;
        }
        if( ans == true) dp[i][target] = 1;
        else dp[i][target] = 0;
       return ans;
    }
}
//Ye 0/1 Subset Sum Problem hai. Dynamic Programming ka classic question.