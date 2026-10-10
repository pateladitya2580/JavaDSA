package DSA.BinaryTrees.Question;
//Same Tree .Leet code 100
public class Question6 {

    class Solution {
        public boolean isSameTree(Node p, Node q) {
            if(p == null && q == null) return true;//base case
            if(p != null && q == null) return false;//base case
            if(p == null && q != null) return false;//base case
            if(p.val != q.val) return false;
            if(isSameTree(p.left,q.left)== false) return false;
            if(isSameTree(p.right,q.right) == false) return false;
            return true;
        }

        static void main(String[] args) {

        }
    }
}
