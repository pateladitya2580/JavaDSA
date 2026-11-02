package DSA.HashMaps_and_HashSets;

import java.util.HashMap;
import java.util.HashSet;

// LeetCode  1930. Unique Length-3 Palindromic Subsequences
public class Question8 {
    class Solution {
        public int countPalindromicSubsequence(String s) {
            HashMap<Character,Integer> firstMap = new HashMap<>();
            HashMap<Character,Integer> lastMap = new HashMap<>();
            for(int i = 0 ;i< s.length();i++){
                char ch = s.charAt(i);
                if(!firstMap.containsKey(ch)) firstMap.put(ch,i);
                lastMap.put(ch,i);
            }
            int count = 0;
            for(char ch : firstMap.keySet()){
                int firstIdx = firstMap.get(ch);
                int lastIdx = lastMap.get(ch);
                HashSet<Character> set = new HashSet<>();
                for(int i = firstIdx + 1;i<= lastIdx-1;i++){
                    set.add(s.charAt(i));
                }
                count += set.size();
            }
            return count;
        }
    }
    static void main(String[] args) {

    }
}
