package DSA.Advance_sorting.cyclic_sort;
//287. Find the Duplicate Number
/*
Given an array of integers nums containing n + 1 integers where each
integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
 */
public class find_duplicate_no {
    public void swap(int i ,int j ,int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findDuplicate(int[] nums) {
        while(true){
            int ele = nums[0];
            if(nums[ele] == ele) return ele;
            swap(0,ele,nums);
        }
    }
    static void main(String[] args) {

    }
}
