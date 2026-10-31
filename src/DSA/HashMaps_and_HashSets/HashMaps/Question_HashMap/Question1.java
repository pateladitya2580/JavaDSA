package DSA.HashMaps_and_HashSets.HashMaps.Question_HashMap;

import java.util.Calendar;
import java.util.HashMap;

//LeetCode 242 Valid Anagram
public class Question1 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
                return false;
            HashMap<Character, Integer> smap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                if (smap.containsKey(key)) {
                    int freq = smap.get(key);
                    smap.put(key, freq + 1);
                } else {
                    smap.put(key, 1);
                }
            }
            HashMap<Character, Integer> tmap = new HashMap<>();
            for (int j = 0; j < t.length(); j++) {
                char Key = t.charAt(j);
                if (tmap.containsKey(Key)) {
                    int fq = tmap.get(Key);
                    tmap.put(Key, fq + 1);
                } else {
                    tmap.put(Key, 1);
                }
            }
            for(char key:smap.keySet()){
                int val1 = smap.get(key);
                if(!tmap.containsKey(key)) return false;
                int val2 = tmap.get(key);
                if(val1 != val2) return false;
            }
            return true;
        }
    }
    static void main(String[] args) {

    }
}
