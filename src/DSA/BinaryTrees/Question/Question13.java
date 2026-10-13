package DSA.BinaryTrees.Question;
//LeetCode 110
//Balanced Binary Tree
public class Question13 {
    class Solution {
        static boolean ans ;
        public int levels(Node root){
            if(root == null) return 0;
            int lvlLeft_SBT = levels(root.left);
            int lvlRight_SBT = levels(root.right);
            int diff = Math.abs(lvlLeft_SBT-lvlRight_SBT);
            if(diff>1) ans = false;
            return 1 + Math.max(lvlLeft_SBT,lvlRight_SBT);
        }
        public boolean isBalanced(Node root) {
            ans = true;
            levels(root);//TC = O(n)
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
