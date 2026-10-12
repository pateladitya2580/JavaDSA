package DSA.BinaryTrees.DFS_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// LeetCode 144 PreOrder
public class PreOrder_by_Iterative {

    class Solution {
        public List<Integer> preorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            if(root != null) st.push(root);
            while(st.size()>0){
                Node temp = st.pop();
                ans.add(temp.val);
                if(temp.right != null) st.push(temp.right);
                if(temp.left != null) st.push(temp.left);
            }
            return ans;
        }
    }

    static void main(String[] args) {

    }
}
