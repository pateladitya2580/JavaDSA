package DSA.BinaryTrees.Question;
/*
LeetCode 112. Path Sum
Given the root of a binary tree and an integer targetSum, return true if
the tree has a root-to-leaf path such that adding up all the values along
the path equals targetSum.
A leaf is a node with no children.
 */
public class Question10 {
    class Solution {
        public boolean hasPathSum(Node root, int targetSum) {
            if(root == null) return false;
            if(root.left == null && root.right == null){
                if(targetSum == root.val) return true;
            }
            int remaining = targetSum - root.val;
            return hasPathSum(root.left,remaining) ||  hasPathSum(root.right,remaining);
        }
    }
    static void main(String[] args) {

    }
}
