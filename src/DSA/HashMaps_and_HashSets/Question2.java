package DSA.HashMaps_and_HashSets;
// LeetCode 2094. Finding 3-Digit Even Numbers
import java.util.ArrayList;
import java.util.HashMap;

public class Question2 {
    class Solution {
        public int[] findEvenNumbers(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int ele : arr) {
                int key = ele;
                if (map.containsKey(key)) {
                    int freq = map.get(key);
                    map.put(key, freq + 1);
                } else {
                    map.put(key, 1);
                }
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 100; i < 999; i+=2) {
                int x = i;
                int a = x % 10;
                x /= 10;
                int b = x % 10;
                x /= 10;
                int c = x;
                if (map.containsKey(a)) {
                    int afreq = map.get(a);
                    map.put(a, afreq - 1);
                    if (afreq == 1)
                        map.remove(a);
                    if (map.containsKey(b)) {
                        int bfreq = map.get(b);
                        map.put(b, bfreq - 1);
                        if (bfreq == 1)
                            map.remove(b);
                        if (map.containsKey(c)) {
                            ans.add(i);
                        }
                        map.put(b, bfreq);
                    }
                    map.put(a, afreq);
                }
            }
            int[] ans2 = new int[ans.size()];
            for (int i = 0; i < ans2.length; i++) {
                ans2[i] = ans.get(i);
            }
            return ans2;
        }
    }
    static void main(String[] args) {

    }
}
