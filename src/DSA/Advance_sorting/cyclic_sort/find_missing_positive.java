package DSA.Advance_sorting.cyclic_sort;
// leet code 41
public class find_missing_positive {
    public void swap(int i,int j ,int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int ele = nums[i];
            if(ele <= 0 || ele > n || i == ele - 1 || ele == nums[ele-1] ) i++;
            else swap(i,ele-1,nums);
        }
        for(i = 0 ;i<n;i++){
            if(i != nums[i]-1) return i+1;
        }
        return n+1;//i+1
    }
    static void main(String[] args) {

    }
}
