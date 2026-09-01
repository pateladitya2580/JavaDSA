package DSA.BinarySearch;
// leet code 1539
public class Kth_missing_positive_number {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0 ;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missed = arr[mid] - (mid + 1);
            if(missed < k){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        // int extra = k - (arr[high] - (high + 1));
        // return arr[high] + extra;
        return k + (high + 1);
    }
    static void main(String[] args) {

    }
}
