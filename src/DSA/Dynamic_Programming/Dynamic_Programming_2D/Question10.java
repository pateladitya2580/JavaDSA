package DSA.Dynamic_Programming.Dynamic_Programming_2D;
//2DP Problem
//LeetCode 62. Unique Paths Problem by Tabulation Method
public class Question10 {
    class Solution {
        public int uniquePaths(int m, int n) {
            int [][] dp = new int [m][n];
            for(int i = 0 ;i<m ;i++){
                for(int j = 0 ;j<n;j++){
                    if(i == 0 || j == 0) dp[i][j] = 1;
                    else dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
            return dp[m-1][n-1];
        }
    }
    static void main(String[] args) {

    }
}
