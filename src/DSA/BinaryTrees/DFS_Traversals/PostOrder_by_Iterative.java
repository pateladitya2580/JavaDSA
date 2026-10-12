package DSA.BinaryTrees.DFS_Traversals;
import java.util.*;
public class PostOrder_by_Iterative {
    class Solution {
        public List<Integer> postorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            if(root != null) st.push(root);
            while(st.size()>0){
                Node temp = st.pop();
                ans.add(temp.val);
                if(temp.left != null) st.push(temp.left);
                if(temp.right != null) st.push(temp.right);
            }
            Collections.reverse(ans);
            return ans;
        }
    }

    static void main(String[] args) {

    }
}
