package DSA.BinaryTrees.Question;
import java.util.*;
//LeetCode 113 Path Sum two
public class Question14 {
    class Solution {
        List<Integer> copy (List<Integer> arr){
            List<Integer> l1 = new ArrayList<>();
            for(int ele : arr){
                l1.add(ele);
            }
            return l1;
        }
        public void helper(Node root,int target,List<Integer> arr,List<List<Integer>> ans){
            if(root == null ) return;
            if(root.left == null && root.right== null){
                if(root.val == target){
                    arr.add(root.val);
                    ans.add(arr);
                }
                return;
            }
            arr.add(root.val);
            List<Integer> arr1 = copy(arr);
            List<Integer> arr2 = copy(arr);
            helper(root.left,target-root.val,arr1,ans);
            helper(root.right,target-root.val,arr2,ans);
        }
        public List<List<Integer>> pathSum(Node root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> arr = new ArrayList<>();
            helper(root,targetSum,arr,ans);
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
