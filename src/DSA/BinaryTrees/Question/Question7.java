package DSA.BinaryTrees.Question;
//Symmetric Tree . Leet Code 101
public class Question7 {
    class Solution {
        public Node invertTree(Node root) {
            if (root == null)
                return null;
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);

            return root;
        }

        public boolean isSameTree(Node p, Node q) {
            if (p == null && q == null)
                return true;//base case
            if (p != null && q == null)
                return false;//base case
            if (p == null && q != null)
                return false;//base case
            if (p.val != q.val)
                return false;
            if (isSameTree(p.left, q.left) == false)
                return false;
            if (isSameTree(p.right, q.right) == false)
                return false;
            return true;
        }

        public boolean isSymmetric(Node root) {
            if(root == null) return true;
            invertTree(root.right);
            if(isSameTree(root.left,root.right)== true) return true;
            return false;
        }
    }

    static void main(String[] args) {

    }
}
