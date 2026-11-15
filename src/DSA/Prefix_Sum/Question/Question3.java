package DSA.Prefix_Sum.Question;
//LeetCode 724. Find Pivot Index
public class Question3 {
    class Solution {
        public int pivotIndex(int[] nums) {
            for(int i = 1;i<nums.length;i++){
                nums[i] += nums[i-1];
            }
            int n = nums.length;
            for(int i = 0 ;i<n;i++){
                int leftSum = 0; int rightSum = 0;
                if(i!=0)leftSum = nums[i-1];
                rightSum = nums[n-1] - nums[i];
                if( i == 0 && rightSum == 0) return i;
                else if (i == n-1 && leftSum == 0) return i;
                else{
                    if(leftSum == rightSum) return i;
                }
            }
            return -1;
        }
    }
    static void main(String[] args) {

    }
}
