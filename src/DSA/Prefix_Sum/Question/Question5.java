package DSA.Prefix_Sum.Question;

import java.util.Arrays;

//LeetCode 2389. Longest Subsequence With Limited Sum
public class Question5 {
    class Solution {
        public int[] answerQueries(int[] arr, int[] queries) {
            Arrays.sort(arr);
            int n  = arr.length;
            int m = queries.length;
            for(int i= 1;i<n;i++){
                arr[i] += arr[i-1];
            }
            int []ans = new int[m];
            for(int i = 0;i<m;i++){
                int low = 0; int high = n-1;
                while (low<= high){
                    int mid = low + (high-low)/2;
                    if(arr[mid]>queries[i]) high = mid -1;
                    else {
                        ans[i] = Math.max(ans[i],mid+1);
                        low = mid+1;
                    }
                }
            }
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
/*
Approach – Maximum Subsequence Score (Answer Queries)**

1\. Sabse pehle given array `arr` ko ascending order mein sort karenge, taaki smallest elements ko pehle select kar sakein.

2\. Ab array par Prefix Sum apply karenge, jisme har index par us index tak ke elements ka cumulative sum store hoga.

3\. Ek `ans[]` array banayenge jo har query ka maximum possible subsequence size store karega.

4\. Har query ke liye Binary Search apply karenge, jisme `low = 0` aur `high = n-1` rakhenge.

5\. `mid` calculate karke check karenge ki `arr[mid]` (prefix sum) query se chhota ya equal hai ya nahi.

6\. Agar `arr[mid] > queries[i]` hai, toh `high = mid-1` karenge, kyunki sum limit exceed ho gayi hai.

7\. Otherwise, current subsequence size `mid+1`(no.of elements milte hai) answer mein update karenge aur `low = mid+1` karenge, taaki aur maximum elements find kar sakein.

8\. Finally, har query ke liye maximum subsequence size return kar denge.

**Time Complexity:**

- Sorting: O(n log n)
- Prefix Sum: O(n)
- Binary Search: O(m log n)

**Total:** O(n log n + m log n)

**Space Complexity:** O(m) for answer array (excluding sorting implementation space).
 */