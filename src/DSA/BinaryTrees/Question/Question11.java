package DSA.BinaryTrees.Question;
//Lowest Common Ancestor of a Binary Tree. LeetCode 236
public class Question11 {

    class Solution {
        public boolean exists(Node root,Node node){
            if(root == node ) return true;
            if(root == null ) return false;
            return exists(root.left,node) || exists(root.right,node);
        }
        public Node lowestCommonAncestor(Node root, Node p, Node q) {
            if(p == root || q == root) return root;
            boolean pLiesInLST = exists(root.left,p);
            boolean qLiesInLST = exists(root.left,q);
            if(pLiesInLST == true && qLiesInLST == true) return lowestCommonAncestor(root.left,p,q);
            if(pLiesInLST == false && qLiesInLST == false) return lowestCommonAncestor(root.right,p,q);
            else return root;
        }
    }

    static void main(String[] args) {

    }
}
