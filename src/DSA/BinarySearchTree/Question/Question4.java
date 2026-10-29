package DSA.BinarySearchTree.Question;

import java.util.ArrayList;
import java.util.List;

// LeetCode 98. Validate Binary Search Tree
// min(RST) > node.val > max(LST)
public class Question4 {
    /*
    class Solution {
    //METHOD 1

    // public int max (TreeNode root){
    //     if(root == null) return Integer.MIN_VALUE;
    //     int a = root.val;
    //     int b = max(root.left);
    //     int c = max(root.right);
    //     return Math.max(a,Math.max(b,c));
    // }

    // public int min (TreeNode root){
    //     if(root == null) return Integer.MAX_VALUE;
    //     int a = root.val;
    //     int b = min(root.left);
    //     int c = min(root.right);
    //     return Math.min(a,Math.min(b,c));
    // }

    // public boolean isValidBST(TreeNode root) {
    //     if(root == null) return true;
    //     if(root.left != null && root.val <= max(root.left) ) return false;
    //     if(root.right != null && root.val >= min(root.right) ) return false;
    //     return isValidBST(root.left) && isValidBST(root.right);
    // }

     */
    // METHOD 2
    class Solution {
        public void inorder(TreeNode root, List<Integer> ans){
            if(root == null) return;
            inorder(root.left,ans);
            ans.add(root.val);
            inorder(root.right,ans);
        }
        public boolean isValidBST(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            inorder(root,ans);
            for(int i = 0 ;i < ans.size()-1;i++){
                if(ans.get(i)>= ans.get(i+1) ) return false;
            }
            return true;
        }
    }
    static void main(String[] args) {

    }
}
