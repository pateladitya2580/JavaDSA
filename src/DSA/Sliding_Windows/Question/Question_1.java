package DSA.Sliding_Windows.Question;
// Maximum sum Subarray of size k.
/*
Two consecutive windows of size 'K' have 'K-1' elements common;
 */
public class Question_1 {
    static void main(String[] args) {
        int[]arr = {10,20,1,3,-40,80,10};
        int n = arr.length;
        int k = 2;
        int maxSum = 0;
        int i = 0, j = k-1, sum = 0;
        for(int a = 0;a<=k-1;a++){
            sum += arr[a];
        }
        i++;j++;
        while (j<n){
            sum = sum -arr[i-1] + arr[j];
            maxSum = Math.max(maxSum,sum);
            i++;j++;
        }
        System.out.println(maxSum);
    }
}
