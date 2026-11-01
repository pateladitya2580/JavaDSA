package DSA.HashMaps_and_HashSets.HashMaps.Question_HashMap;
import java.util.HashMap;
//LeetCode 1, Two Sum
public class Question2 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int n = nums.length;
            int[] ans = {-1,-1};
            for (int i = 0; i < n; i++) {
                int remain = target - nums[i];
                if(map.containsKey(remain)){
                    ans[0] = i;
                    ans[1] = map.get(remain);
                    return ans;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
