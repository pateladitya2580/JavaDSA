package DSA.BinaryTrees.Traversals;

import java.util.ArrayList;
import java.util.List;

// Leetcode 94 Binary Tree inorder Traversal
public class Question2 {
    class Solution {
        private void helper(Node root, List<Integer> ans){
            if(root == null) return;
            helper(root.left,ans);
            ans.add(root.val);
            helper(root.right,ans);
        }
        public List<Integer> preorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            helper(root,ans);
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
