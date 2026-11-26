package DSA.Dynamic_Programming.Dynamic_Programming_2D;
//LeetCode 1277 Count Square Submatrices with all Ones.(2 DP problem )
public class Question12 {
    class Solution {
        public int countSquares(int[][] arr) {
            int m = arr.length;
            int n = arr[0].length;
            int count = 0;
            for(int i = 0 ;i< m ;i++){
                for(int j = 0 ;j<n ;j++){
                    if(arr[i][j]== 0) continue;
                    if(i> 0 && j > 0){
                        arr[i][j] += min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1]);
                    }
                    count += arr[i][j];
                }
            }
            return count;
        }
        public int min(int a,int b,int c){
            return Math.min(a,Math.min(b,c));
        }
    }
    static void main(String[] args) {

    }
}
