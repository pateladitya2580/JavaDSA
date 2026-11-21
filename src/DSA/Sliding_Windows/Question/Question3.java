package DSA.Sliding_Windows.Question;
//LeetCode 209. Minimum Size Subarray Sum// variable size window
public class Question3 {

    class Solution {
        public int minSubArrayLen(int target, int[] arr) {
            int n = arr.length;
            int sum = 0;
            int minLen = Integer.MAX_VALUE;

            int i = 0, j = 0;

            while (j < n) {
                sum += arr[j];

                while (sum >= target) {
                    int len = j - i + 1;
                    minLen = Math.min(len, minLen);

                    sum -= arr[i];
                    i++;
                }

                j++;
            }

            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }
    }

    static void main(String[] args) {

    }
}
