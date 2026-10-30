package DSA.BinarySearchTree.Question;

import java.util.ArrayList;
import java.util.List;

//LeetCode 114. Flatten Binary Tree to Linked List
public class Question10 {

    class Solution {
        public void preorder(TreeNode root, List<TreeNode> pre){
            if(root == null) return ;
            pre.add(root);
            preorder(root.left,pre);
            preorder(root.right,pre);
        }
        public void flatten(TreeNode root) {
            List<TreeNode > pre = new ArrayList<>();
            preorder(root,pre);
            int n = pre.size();
            for(int i = 0 ;i< n;i++){
                if(i!=n-1) pre.get(i).right = pre.get(i+1);
                pre.get(i).left = null;
            }

        }
    }
    static void main(String[] args) {

    }
}
