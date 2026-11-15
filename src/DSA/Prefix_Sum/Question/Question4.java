package DSA.Prefix_Sum.Question;
//LeetCode 238. Product of Array Except Self
public class Question4 {
    class Solution {
        public int[] productExceptSelf(int[] arr) {
            int n = arr.length;
            int []pre = new int[n];
            pre[0] = 1;
            for(int i = 1;i<n;i++){
                pre[i] = pre[i-1]* arr[i-1];
            }

            int []suf = new int[n];
            suf[n-1] = 1;
            for(int i = n-2;i>=0;i--){
                suf[i] = suf[i+1] * arr[i+1];
            }

            int []ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = pre[i]*suf[i];
            }
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
/*
Approach – Product of Array Except Self (LeetCode 238)
1. Sabse pehle ek pre[] array banayenge jo har index ke left-side elements ka product store karega.

2. pre[0] = 1 rakhenge kyunki first index ke left mein koi element nahi hai.

3. Left to Right traverse karke prefix product calculate karenge.

4. Ab ek suf[] array banayenge jo har index ke right-side elements ka product store karega.

5. suf[n-1] = 1 rakhenge kyunki last index ke right mein koi element nahi hai.

6. Right to Left traverse karke suffix product calculate karenge.

7. Finally, ans[i] = pre[i] * suf[i] karenge. Isse current index ko chhodkar baaki sabhi elements ka product mil jayega.

Time Complexity: O(n)

Space Complexity: O(n)
 */