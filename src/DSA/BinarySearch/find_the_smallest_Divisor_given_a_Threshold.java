package DSA.BinarySearch;
//Leet code 1283
public class find_the_smallest_Divisor_given_a_Threshold {
    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        //find maximum
        for(int i = 0 ;i< n ;i++){
            mx = Math.max(mx,arr[i]);
        }
        //apply BS
        int low = 1;
        int high = mx;
        int d = 1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int sum = 0;
            for(int i = 0 ;i<n ;i++){
                if(arr[i]%mid ==  0) {
                    sum += arr[i]/mid;
                }
                else{
                    sum += arr[i]/mid + 1;
                }
            }
            if(sum > t){
                low = mid +1;
            }
            else if (sum <= t){
                d = mid;
                high = mid -1;
            }
        }
        return d;
    }
    static void main(String[] args) {

    }
}
