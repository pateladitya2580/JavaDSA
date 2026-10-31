package DSA.HashMaps_and_HashSets.Question;

import java.util.HashSet;

//LeetCode 2744. Find Maximum Number of String Pairs
public class Question2 {
    //Brute Force ,METHOD 1
    class Solution {
        public String reverse(String str){
            char[] arr = str.toCharArray();
            int n = arr.length;
            int i = 0,j = n-1;
            while(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            String s = new String(arr);
            return s;
        }
        public int maximumNumberOfStringPairs(String[] words) {
            int n = words.length;
            int count = 0;
            for(int i = 0 ;i< n;i++){
                String str = reverse(words[i]);
                for(int  j = i+1;j<n;j++){
                    if(str.equals(words[j])) count++;
                }
            }
            return count;
        }
    }

    // METHOD 2 by using hashSets
    class Sol {
        public String reverse(String str){
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }
        public int maximumNumberOfStringPairs(String[] words) {
            HashSet set = new HashSet<>();
            int n = words.length;
            int count = 0;
            for(int i = 0 ;i< n;i++){
                String str = reverse(words[i]);
                if(set.contains(str)){
                    count++;
                }
                else{
                    set.add(words[i]);
                }
            }
            return count;
        }
    }
    static void main(String[] args) {

    }
}
