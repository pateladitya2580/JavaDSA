package DSA.BinarySearchTree.Question;
import java.util.ArrayList;
import java.util.List;
//LeetCode 230,Kth Smallest Element in a BST
// inorder sorted rehta hai assending order me
public class Question3 {
    class Solution {
        public void inOrder(TreeNode root, List<Integer> ans){
            if(root == null) return;
            inOrder(root.left,ans);
            ans.add(root.val);
            inOrder(root.right,ans);
        }
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> ans = new ArrayList<>();
            inOrder(root,ans);
            return ans.get(k-1);
        }
    }

    static void main(String[] args) {

    }
}
