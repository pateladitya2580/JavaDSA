package DSA.Advance_sorting.cyclic_sort;
// leet code 287
public class Duplicate_number {
    public void swap(int i ,int j ,int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findDuplicate(int[] nums) {
        while(true){
            int ele = nums[0];
            if(ele == nums[ele]) return ele;
            swap(0,ele,nums);
        }
    }
    static void main(String[] args) {

    }
}
