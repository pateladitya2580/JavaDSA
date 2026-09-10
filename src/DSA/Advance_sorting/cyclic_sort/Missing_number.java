package DSA.Advance_sorting.cyclic_sort;
/*
leet code 268
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */
public class Missing_number {
    public void swap(int i,int j ,int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i =0;
        while(i<n){
            if(nums[i] == i || nums[i]==n) i++;
            else{
                swap(i,nums[i],nums);
            }
        }
        for(i = 0 ;i<n ;i++){
            if(nums[i] != i) return i;
        }
        return i;//n
        // return of n isliye kia kyo ki yadi index or uski value same hai matlab
        //0 par 0 or n-1 par n-1 to simple sa concept hai ki n missing hai
    }
    static void main(String[] args) {

    }
}
