package DSA.BinarySearch;
//Leet code 33
public class Search_in_rotated_sorted_array {
    public int BinarySearch(int[] arr, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] > target)
                high = mid - 1;
        }
        return -1;
    }

    public int search(int[] arr, int target) {
        //find pivot
        int n = arr.length;
        if(n<=2){
            for(int i = 0 ;i<n;i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }
        int lo = 1, hi = n - 2;//pivat first or last me nahi milenge
        int p = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                p = mid;
                break;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                p = mid - 1;
                break;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                if (arr[mid] > arr[n - 1]) {
                    lo = mid + 1;
                } else if (arr[mid] < arr[n - 1]) {
                    hi = mid - 1;
                }
            }
        }
        if (p == -1) {// array was never rotated
            return BinarySearch(arr, lo, hi, target);
        }
        int left = BinarySearch(arr, lo, p, target);
        if (left != -1)  return left;

        int right = BinarySearch(arr, p + 1, hi, target);
        if (right != -1) return right;

        return -1;
    }
    static void main(String[] args) {

    }
}
