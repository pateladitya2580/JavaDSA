package DSA.BinaryTrees.Traversals;
import java.util.ArrayList;
import java.util.List;
// Leet code 145 Binary Tree Postorder Traversal
public class Question3 {
    class Solution {
        private void helper(Node root, List<Integer> ans){
            if(root == null) return;
            helper(root.left,ans);
            helper(root.right,ans);
            ans.add(root.val);
        }

        public List<Integer> postorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            helper(root,ans);
            return ans;
        }
    }
}
