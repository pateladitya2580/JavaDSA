package DSA.Sliding_Windows.Question;
//LeetCode 1248. Count Number of Nice Subarrays
public class Question8 {
    class Solution {
        public int numberOfSubarrays(int[] arr, int k) {
            int i = 0,j =0, a = 0, b = 0 , n = arr.length, k2 = 0;
            //move 'i' to first '1'
            while (i< n && arr[i]%2 == 0) i++;
            while (j<n && k2 < k ){
                if(arr[j]%2 != 0) k2++;
                j++;
            }
            if(k2<k )return 0;
            j--;
            b = j+1;
            while (b<n && arr[b]%2==0)b++;
            b--;
            int count = 0;
            while (b<n){
                //sliding window
                count += (i-a+1)*(b-j+1);

                a = i+1;

                i++;
                while(i<n && arr[i]%2 == 0) i++;

                j = b+1;

                b =  j+1;
                while (b<n && arr[b]%2 ==0) b++;
                b--;

            }
            return count;
        }
    }
    static void main(String[] args) {

    }
}
