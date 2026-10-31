package DSA.HashMaps_and_HashSets.HashSet.Question_HashSet;

import java.util.HashSet;

// LeetCode 2442.
//Count number of distinct integers after reverse operations
public class Question1 {
    class Solution {
        public int  reverse(int num){
            int reverse = 0;
            while(num > 0){
                int lastDigit = num%10;
                reverse = reverse * 10 + lastDigit;
                num = num/10;
            }
            return reverse;
        }
        public int countDistinctIntegers(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int n = nums.length;
            for(int i = 0;i<n;i++){
                set.add(nums[i]);
                int x = reverse(nums[i]);
                set.add(x);
            }
            return set.size();
        }
    }
    static void main(String[] args) {

    }
}
