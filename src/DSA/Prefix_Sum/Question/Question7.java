package DSA.Prefix_Sum.Question;
//LeetCode 560. Subarray Sum Equals K

import java.util.HashMap;

public class Question7 {
    //Brute force
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            for(int i =0 ;i<nums.length;i++){
                int sum = 0;
                for(int j = 0;j<nums.length;j++){
                    sum += nums[j];
                    if(sum == k ) count++;
                }
            }
            return count;
        }
    }
    //improve method
    class Sol {
        public int subarraySum(int[] arr, int k) {
            int count = 0; int n = arr.length;
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i = 1;i<n;i++){
                arr[i] += arr[i-1];
            }
            for(int i = 0 ;i<n;i++){
                int ele = arr[i];
                if(ele == k ) count++;
                int remianing = ele -k;
                if(map.containsKey(remianing)){
                    int freq = map.get(remianing);
                    count += freq;

                }
                if(map.containsKey(ele)){
                    int freq = map.get(ele);
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
