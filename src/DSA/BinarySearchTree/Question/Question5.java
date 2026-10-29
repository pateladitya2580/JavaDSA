package DSA.BinarySearchTree.Question;
//LeetCode 235. Lowest Common Ancestor of a Binary Search Tree
public class Question5 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == p|| root == q || p == q) return root;
            if ( root.val < p.val && root.val < q.val ) return lowestCommonAncestor(root.right,p,q);
            else if ( root.val > p.val && root.val > q.val ) return lowestCommonAncestor(root.left,p,q);
            else return root;
        }
    }
    static void main(String[] args) {

    }

}
