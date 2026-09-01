package DSA.BinarySearch.On_answer;
// leet code 2064
/*
aggressive cows
koko eating bananas
min.time_to_complete_trips
must do questions;
 */
public class Mininized_maximum_of_products_distributed_to_any_store {
    public boolean isPossible(int maxQ,int n ,int []arr){
        int stores = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % maxQ == 0){
                stores += arr[i]/maxQ;
            }
            else{
                stores += arr[i]/maxQ + 1;
            }
        }
        if(stores > n ) return  false;
        else return true;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ;i<m ;i++){
            mx = Math.max(mx,arr[i]);
        }
        int low = 1;
        int high = mx;
        int ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPossible(mid,n,arr)== true){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    static void main(String[] args) {

    }
}
