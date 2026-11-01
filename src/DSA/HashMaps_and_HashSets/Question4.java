package DSA.HashMaps_and_HashSets;

import java.util.HashMap;

//LeetCode 1497. Check If Array Pairs Are Divisible by k
public class Question4 {
    class Solution {
        public boolean canArrange(int[] arr, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele:arr){
                int key =  ele%k;
                if(key<0) key += k;// k negative side ja raha tha islye usme k
                if(map.containsKey(key)){// add kar ke +ve range me laye hai
                    int freq = map.get(key);
                    map.put(key,freq+1);
                }
                else{
                    map.put(key,1);
                }

            }
            if(map.containsKey(0)){
                if(map.get(0)%2 != 0 ) return false;
                map.remove(0);
            }

            if(k%2 == 0 && map.containsKey(k/2)){// optinal hai kyo ki array kabhi
                if(map.get(k/2)%2 != 0 ) return false;// odd length ka nahi hoga
                map.remove(k/2);
            }
            for(int key : map.keySet()){
                int rem = k - key;
                if(!map.containsKey(rem)) return false;
                int keyFreq = map.get(key);
                int remFreq = map.get(rem);
                if(keyFreq != remFreq) return false;
            }
            return true;
        }
    }
    static void main(String[] args) {

    }
}

/*
 * REMAINDER PAIRING – CORE LOGIC
 *
 * Example:
 * a = 12, b = 18, k = 5
 *
 * Step 1: Dono numbers ka remainder nikalo.
 * 12 % 5 = 2
 * 18 % 5 = 3
 *
 * Step 2: Dono remainders ko add karo.
 * 2 + 3 = 5 (= k)
 *
 * Step 3: Original numbers ka sum check karo.
 * 12 + 18 = 30
 * 30 % 5 = 0
 *
 * CONCLUSION:
 * Agar do numbers ke remainders ka sum k ke equal
 * hota hai, toh un original numbers ka sum k se
 * completely divisible hota hai.
 *

 */
