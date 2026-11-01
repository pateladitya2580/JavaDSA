package DSA.HashMaps_and_HashSets;

import java.util.HashMap;
import java.util.HashSet;

//LeetCode 3,
public class Question3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            //2 pointer approach i and j sliding window from i to j
            int n = s.length();
            if(n<=1) return n;
            int maxLen = 0;
            int i =0 , j= 0;
            HashMap<Character,Integer> map = new HashMap<>();
            while(j<n){
                char ch = s.charAt(j);
                if(map.containsKey(ch) && map.get(ch)>=i){
                    int len = j-i;
                    maxLen = Math.max(len,maxLen);
                    i = map.get(ch) +1;
                }
                map.put(ch,j);
                j++;
            }
            int len = j-i;
            maxLen = Math.max (maxLen,len);
            return maxLen;
        }
    }
    static void main(String[] args) {

    }
}
