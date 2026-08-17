package DSA.BinarySearch;
//given a sorted integer array and an integer 'x' ,  find the lower bound
//of x.(smallest idx such that arr[idx] >= x)
/*
Lower Bound:
In a sorted array, the lower bound of a target is the first element that is greater than or equal to the target (>= target).

Example:
[1, 3, 5, 7, 9], target = 6
→ Lower Bound = 7.
 */
public class LowerBound {
    static void main(String[] args) {
        int []arr = {10,23,46,46,91,97,97,140,264};
        int n = arr.length;
        int target = 46;
        int low = 0;
        int high = n - 1;
        int lower_bound = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                lower_bound = Math.min(mid,lower_bound);
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println(lower_bound);
    }
}
