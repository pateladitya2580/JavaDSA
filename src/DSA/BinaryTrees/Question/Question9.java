package DSA.BinaryTrees.Question;

import java.util.ArrayList;
import java.util.List;

//Binary Tree Paths .LeetCode 257
/*
You are given the root of a binary tree.

Return all root-to-leaf paths in any order.

A leaf is a node with no children.
 */
public class Question9 {
    class Solution {
        public void path(Node root , String s , List<String> ans){
            if(root == null) return;
            if(root.left == null && root.right == null){
                s += root.val;
                ans.add(s);
                return;
            }
            path(root.left,s+root.val+"->",ans);
            path(root.right,s+root.val+"->",ans);
        }
        public List<String> binaryTreePaths(Node root) {
            List<String> ans = new ArrayList<>();
            path(root,"",ans);
            return ans;
        }
    }

    static void main(String[] args) {

    }
}
