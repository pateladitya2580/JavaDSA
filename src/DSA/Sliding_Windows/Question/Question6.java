package DSA.Sliding_Windows.Question;
// LeetCode 1052. Grumpy Bookstore Owner
public class Question6 {

    class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

            int satisfied = 0;
            int TotalNonsatisfied = 0;
            int n = customers.length;

            // Step 1: Count customers who are already satisfied
            // grumpy[i] == 0 means owner is not grumpy
            for (int i = 0; i < n; i++) {
                if (grumpy[i] == 0) {
                    satisfied += customers[i];
                }
            }

            // Step 2: Create the first fixed-size sliding window
            // Window size = minutes
            int left = 0, right = minutes - 1;
            int NonSatisfied = 0;

            // Calculate extra satisfied customers in the first window
            // Only count customers where grumpy[i] == 1
            for (int i = left; i <= right; i++) {
                if (grumpy[i] == 1) {
                    NonSatisfied += customers[i];
                }
            }

            // Store the maximum extra satisfied customers
            TotalNonsatisfied = Math.max(TotalNonsatisfied, NonSatisfied);

            // Move the window one position forward
            left++;
            right++;

            // Step 3: Slide the window until right reaches the end
            while (right < n) {

                // Remove the outgoing element from the previous window
                if (grumpy[left - 1] == 1) {
                    NonSatisfied -= customers[left - 1];
                }

                // Add the incoming element to the current window
                if (grumpy[right] == 1) {
                    NonSatisfied += customers[right];
                }

                // Update maximum extra satisfied customers
                TotalNonsatisfied = Math.max(TotalNonsatisfied, NonSatisfied);

                // Move both window boundaries forward
                left++;
                right++;
            }

            // Final answer = Already satisfied + Maximum extra satisfied
            return satisfied + TotalNonsatisfied;
        }
    }

    static void main(String[] args) {

    }
}
