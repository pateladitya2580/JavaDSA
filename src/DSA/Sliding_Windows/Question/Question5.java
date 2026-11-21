package DSA.Sliding_Windows.Question;
//LeetCode 1493. Longest Subarray of 1's After Deleting One Element
public class Question5 {

    class Solution {
        public int longestSubarray(int[] arr) {
            int n = arr.length;
            int i = 0, j = 0;
            int zeroes = 0;
            int maxLen = 0;

            while (j < n) {
                if (arr[j] == 0) {
                    zeroes++;
                }

                while (zeroes > 1) {
                    if (arr[i] == 0) {
                        zeroes--;
                    }
                    i++;
                }

                maxLen = Math.max(maxLen, j - i);
                j++;
            }

            return maxLen;
        }
    }

    static void main(String[] args) {

    }
}
