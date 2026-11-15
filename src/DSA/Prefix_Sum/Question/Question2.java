package DSA.Prefix_Sum.Question;
//LeetCode 303. Range Sum Query - Immutable
public class Question2 {
    class NumArray {
        int []ans;
        public NumArray(int[] nums) {
            ans = nums;
        }

        public int sumRange(int left, int right) {
            int []preSum = new int[ans.length];
            preSum[0] = ans[0];
            for(int i = 1;i<ans.length;i++){
                preSum[i] = ans[i] + preSum[i-1];
            }
            if(left != 0){
                return preSum[right] - preSum[left -1];
            }
            else{
                return preSum[right];
            }
        }
    }
    static void main(String[] args) {

    }
}
