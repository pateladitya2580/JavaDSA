package DSA.BinarySearch;
//Leet code 852
/*
You are given an integer mountain array arr of length n where the values increase
to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
 */
public class Peak_index_in_a_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1;int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid+1;
            else if (arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) high = mid-1;
        }
        return -1;
    }
    static void main(String[] args) {
    }
}
