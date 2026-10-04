package DSA.BinaryTrees.Traversals;
import  java.util.*;
//Leet code 144 preorder
//Binary Tree Preorder Traversal
public class Question1 {
    class Solution {
        private void preorder(Node root,List<Integer>ans){
            if(root == null) return;
            ans.add(root.val);
            preorder(root.left,ans);
            preorder(root.right,ans);
        }
        public List<Integer> preorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            preorder(root,ans);
            return ans;
        }

    }
    static void main(String[] args) {

    }
}
