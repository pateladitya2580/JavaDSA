package DSA.Sliding_Windows.Question;
// LeetCode 713. Subarray Product Less Than K
public class Question4 {

    class Solution {
        public int numSubarrayProductLessThanK(int[] arr, int k) {
            int n = arr.length;
            int product = 1;
            int count = 0;

            int i = 0, j = 0;

            while (j < n) {
                product *= arr[j];

                while (i <= j && product >= k) {
                    product /= arr[i];
                    i++;
                }

                count += j - i + 1;
                j++;
            }

            return count;
        }
    }

    static void main(String[] args) {

    }
}
