package DSA.BinarySearch;
/*
Upper Bound

Definition:
In a sorted array, the upper bound of a target is the first element that is
strictly greater than the target (> target).
Example:
[1, 3, 5, 5, 7, 9], target = 5
Upper Bound → 7 (first > 5)
 */
public class UpperBound {
    static void main(String[] args) {
        int []arr = {10,23,46,46,91,97,97,140,264};
        int n = arr.length;
        int x = 40;
        int low = 0;
        int high = n-1;
        int Upper_bound = n;
        while (low<=high){
            if(x > arr[n-1]){
                System.out.println(n);// jab element sabse bada ho array me na ho to n return karo
            }
            else if (x<arr[0]){
                System.out.println(0);//jab element sabse chota ho or array me na ho to 0 return karo
            }
            else {
                int mid = low +  (high - low)/2;
                if(arr[mid]<x){
                    low= mid+1;
                }
                else if (arr[mid]>x){
                    Upper_bound = Math.min(Upper_bound,mid);
                    high = mid-1;
                }
            }
        }
        System.out.println(Upper_bound);
    }
}
