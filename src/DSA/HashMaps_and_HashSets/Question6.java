package DSA.HashMaps_and_HashSets;

import java.util.HashMap;

//LeetCode 1814 .Count Nice Pairs In An Array
public class Question6 {
    class Solution {
        public int reverse(int n){
            int rev = 0;
            while(n!=0){
                int remain = n%10;
                rev = rev * 10 +remain;
                n = n/10;
            }
            return rev;
        }
        public int countNicePairs(int[] nums) {
            int count =0;
            HashMap<Integer,Integer> map = new HashMap<>();
            int n = nums.length;
            for(int i = 0;i< n ;i++){
                int ele = nums[i] - reverse(nums[i]);
                if(map.containsKey(ele)){
                    int freq = map.get(ele);
                    count += freq;
                    count %= 1000000007;
                    map.put(ele,freq+1);
                }
                else{
                    map.put(ele,1);
                }
            }
            return count;
        }
    }
    static void main(String[] args) {

    }
}
