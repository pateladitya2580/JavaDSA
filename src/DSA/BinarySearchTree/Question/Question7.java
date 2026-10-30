package DSA.BinarySearchTree.Question;
//Convert sorted Array to Binary Search Tree , LeetCode 108
public class Question7 {
    class Solution {
        public TreeNode helper(int[] nums,int low ,int high){
            if(low > high) return null;
            int mid = (low + high)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums,low,mid-1) ;
            root.right =  helper(nums,mid+1,high);
            return root;
        }
        public TreeNode sortedArrayToBST(int[] nums) {
            int n = nums.length;
            TreeNode temp = helper(nums,0 ,n-1);
            return temp;
        }
    }
    static void main(String[] args) {

    }
}
