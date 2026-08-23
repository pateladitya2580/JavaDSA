package DSA.BinarySearch;
//leet code 33
public class Search_In_Rotated_Array {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid]== target) return mid;

            else if (arr[mid]<=arr[high]){
                // right part of array me hai
                //check element is present or not
                if(target >= arr[mid] && target <= arr[high]) low = mid+1;
                else high = mid -1;
            }
            else if(arr[mid] > arr[high]){
                //left part of array me hai
                //check element is present or not
                if(target <= arr[mid] && target >= arr[low]) high = mid -1;
                else low = mid + 1;
            }
        }
        return -1;
    }
    static void main(String[] args) {

    }
}
