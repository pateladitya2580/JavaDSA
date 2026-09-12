package DSA.Advance_sorting.cyclic_sort;
import java.util.*;
// leet code 448
public class find_all_numbers_disappeared_in_the_array {
    static List<Integer> ans;
    public void swap(int i,int j ,int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct_idx = nums[i] - 1;
            if(i == correct_idx || nums[i] == nums[correct_idx]){
                i++;
            }
            else{
                swap(i,correct_idx,nums);
            }
        }
        for(i = 0 ;i<n;i++){
            if(i != nums[i]-1){
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void main(String[] args) {

    }
}
