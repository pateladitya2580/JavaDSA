package DSA.BinarySearchTree.Question;

import java.util.ArrayList;
import java.util.List;

//LeetCode 1038. Binary Search Tree to Greater Sum Tree
public class Question6 {

    //METHOD 1;
    class Sol {
        public void inorder(TreeNode root, List<TreeNode> ans){
            if(root == null ) return;
            inorder(root.left,ans);
            ans.add(root);
            inorder(root.right,ans);
        }
        public TreeNode bstToGst(TreeNode root) {
            List<TreeNode> arr = new ArrayList<>();
            inorder(root,arr);
            int n = arr.size();
            for(int i = n-2;i>=0 ; i--){
                arr.get(i).val += arr.get(i+1).val;
            }
            return root;
        }
    }

    //METHOD 2;

    class Solution {
        static int sum ;
        public void Reverseinorder(TreeNode root){
            if(root == null ) return;
            Reverseinorder(root.right);
            root.val += sum;
            sum = root.val;
            Reverseinorder(root.left);
        }
        public TreeNode bstToGst(TreeNode root) {
            sum = 0;
            Reverseinorder(root);
            return root;
        }
    }
    static void main(String[] args) {

    }
}
