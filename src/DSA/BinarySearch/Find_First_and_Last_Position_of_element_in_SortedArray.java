package DSA.BinarySearch;
//LeetCode 34
// Index:  0   1   2   3   4   5   6   7   8   9   10  11
// Array: 10  10  20  20  20  20  20  30  30  30  40  40
/*
Agar 20 ki baat kar rahe ho:
Lower Bound = 2
Upper Bound = 7
20 ka last index = 6 (upper_bound - 1)
*/
public class Find_First_and_Last_Position_of_element_in_SortedArray {
    static void main(String[] args) {
        int [] arr = { 10,10,20,20,20,20,20,30,30,30,40,40};
        int n = arr.length;
        int target = 20;//x
        int low = 0 ;
        int high = n-1;
        int lowerboud = n;
        while (low<=high){
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                lowerboud = Math.min(mid,lowerboud);
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        low= 0;
        high = n-1;
        int upperbound = n;
        while (low<=high){
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                upperbound = Math.min(mid,upperbound);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("The first position is "+lowerboud);
        System.out.println("The last position is "+(upperbound-1));
    }
}
