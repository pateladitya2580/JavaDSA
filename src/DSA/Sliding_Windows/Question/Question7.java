package DSA.Sliding_Windows.Question;

import java.util.HashMap;

//LeetCode 904. Fruit Into Baskets
public class Question7 {
    class Solution {
        public int totalFruit(int[] arr) {
            HashMap<Integer,Integer>map = new HashMap<>();
            int n = arr.length, i = 0 ,j = 0, maxLen = 0;
            while(j<n){
                if(map.containsKey(arr[j])){
                    map.put(arr[j],map.get(arr[j])+1);
                }
                else{
                    map.put(arr[j],1);
                }
                while (map.size()>2){
                    int freq = map.get(arr[i]);
                    if(freq == 1) map.remove(arr[i]);
                    else map.put(arr[i],freq-1);
                    i++;
                }
                int len = j-i+1;
                maxLen = Math.max(maxLen,len);
                j++;
            }
            return maxLen;
        }
    }
    static void main(String[] args) {

    }
}
//find the length of largest subarray that contains atmost 2
//distint elements