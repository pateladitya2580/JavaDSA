package DSA.BinarySearchTree.Question;
//Search in a Binary Search Tree ,LeetCode 700
 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
 }
public class Question1 {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if(root == null ) return null;
            if(val > root.val){
                return searchBST(root.right,val);
            }
            else if (val < root.val){
                return searchBST(root.left,val);
            }
            else{// root.val == val
                return root;
            }
        }
    }
}
