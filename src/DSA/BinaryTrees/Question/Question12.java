package DSA.BinaryTrees.Question;
import java.util.ArrayList;
import java.util.List;
//Leetcode 199
//Binary Tree Right Side View (All the nodes which are at the rightmost in
//each level)
public class Question12 {

    class Solution {
        public int levels(Node root){
            if(root == null) return 0;
            return 1 + Math.max(levels(root.left),levels(root.right));
        }
        public void preOrder(Node root,int levels,List<Integer>ans){
            if(root == null) return ;
            ans.set(levels,root.val);
            preOrder(root.left,levels+1,ans);
            preOrder(root.right,levels+1,ans);
        }
        public List<Integer> rightSideView(Node root) {
            List<Integer> ans = new ArrayList<>();
            int n = levels(root);
            for(int i = 0 ;i<= n-1;i++){
                ans.add(0);
            }
            preOrder(root,0,ans);
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
