package DSA.Prefix_Sum.Question;
//LeetCode 2483. Minimum Penalty for a Shop
public class Question8 {
    class Solution {
        public int bestClosingTime(String str) {
            int n = str.length();
            int [] prefix = new int[n+1];
            for(int i = 1;i <= n;i++){
                prefix[i] = prefix[i-1];
                if(str.charAt(i-1) == 'N') prefix[i] += 1;
            }
            int [] suffix = new int [n+1];
            for(int i = n-1;i>= 0;i--){
                suffix[i] = suffix[i+1];
                if(str.charAt(i)=='Y') suffix[i] += 1;
            }

            int []penalties = new int [n+1];
            int minPenalty = Integer.MAX_VALUE;
            for (int i = 0; i < penalties.length; i++) {
                penalties[i] = prefix[i] + suffix[i];
                minPenalty = Math.min(minPenalty,penalties[i]);
            }
            for (int i = 0; i < penalties.length; i++) {
                if(penalties[i]== minPenalty) return i;
            }
            return 5324;
        }
    }

    // Prefix Sum

// Left to Right Traversal
// Stores cumulative count of N before closing hour.

// Suffix Sum
// Right to Left Traversal
// Stores cumulative count of Y from closing hour onwards.

// Penalty Formula
// Penalty(i) = Prefix[i] + Suffix[i]

    // Earliest Minimum
// Traverse Left to Right.
// Return the first index having minimum penalty.
    static void main(String[] args) {

    }
}
