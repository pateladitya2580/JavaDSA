package DSA.BinarySearch;
import java.util.*;
// leet code 658
public class Find_K_Closest_Elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList();
        int n = arr.length;
        //base case
        if(x<arr[0]){
            for(int i = 0 ;i < k;i++){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }

        if(x> arr[n-1]){
            for(int i = n-1;i >= n-k;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        //lower bound
        int low = 0;
        int high = n-1;
        int lb = n;
        while (low <= high ){
            int mid = low + (high - low)/2;
            if(arr[mid]>= x ){
                lb = Math.min(lb,mid);
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        // two pointer to determine closest elements
        int i = lb-1;
        int j = lb;
        while(k > 0 && i >= 0 && j<n ){
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while( i < 0 && k > 0){
            ans.add(arr[j]);
            j++;
            k--;

        }
        while( j == n && k > 0){
            ans.add(arr[i]);
            i--;
            k--;

        }
        Collections.sort(ans);
        return ans;
    }
    static void main(String[] args) {

    }
}
