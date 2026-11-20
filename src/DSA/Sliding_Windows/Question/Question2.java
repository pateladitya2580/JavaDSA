package DSA.Sliding_Windows.Question;
// LeetCode 1343. Number of Sub-arrays of Size K and
// Average Greater than or Equal to Threshold
public class Question2 {
    class Solution {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int n = arr.length;
            int i =0 ,j = k-1, sum = 0;
            int count = 0;
            int avg = 0;
            for(int a = 0 ;a <= k-1;a++){// first window sum
                sum += arr[a];
                avg = sum/k;
            }
            if(avg >= threshold) count++;
            i++;j++;
            while (j<n){
                sum = sum - arr[i-1] + arr[j];
                avg = sum/k;
                if(avg >= threshold) count++;
                i++;j++;
            }
            return count;
        }
    }
    static void main(String[] args) {

    }
}
