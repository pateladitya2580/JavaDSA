package DSA.BinarySearchTree.Question;
//Insert into a Binary Search Tree , LeetCode 701
public class Question2 {
    class Solution {
        public void insert(TreeNode root,int val){
            if(val < root.val){
                if(root.left == null) root.left = new TreeNode(val);
                else insert(root.left,val);

            }
            else{// val > root.val
                if(root.right == null) root.right = new TreeNode(val);
                else insert(root.right,val);
            }

        }
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root == null) return new TreeNode(val);
            insert(root,val);
            return root;
        }
    }
    static void main(String[] args) {

    }
}
