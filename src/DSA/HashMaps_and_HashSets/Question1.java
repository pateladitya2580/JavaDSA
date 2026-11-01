package DSA.HashMaps_and_HashSets;
//LeetCode 1207. Unique Number of Occurrences
import java.util.HashMap;
import java.util.HashSet;

public class Question1 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                int key = arr[i];
                if (map.containsKey(key)) {
                    int freq = map.get(key);
                    map.put(key, freq + 1);
                } else {
                    map.put(key, 1);
                }
            }
            for (int val : map.values()) {
                if (set.contains(val)) {
                    return false;
                } else {
                    set.add(val);
                }
            }
            return true;
        }
    }
    static void main(String[] args) {

    }
}
