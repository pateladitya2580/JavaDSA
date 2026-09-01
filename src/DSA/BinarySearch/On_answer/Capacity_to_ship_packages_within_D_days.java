package DSA.BinarySearch.On_answer;
// leet code 1011
public class Capacity_to_ship_packages_within_D_days {
    public boolean isPossible(int c ,int[]arr,int d){
        int n = arr.length;
        int days = 1;
        int load =0;
        for(int i = 0 ;i<n;i++){
            if(load + arr[i] <= c){
                load += arr[i];
            }
            else{
                load = arr[i];
                days++;
            }
        }
        if(days>d)return false;
        else return true;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ;i<n ;i++){
            mx = Math.max(mx,arr[i]);
            sum += arr[i];
        }
        int low = mx;
        int high = sum;
        int minC = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPossible(mid,arr,d) == true){
                minC = mid;
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return minC;
    }
    static void main(String[] args) {

    }
}
