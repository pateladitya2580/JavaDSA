package DSA.BinarySearchTree.Question;

import java.util.Arrays;

//Construct Binary Search Tree from Preorder traversal ,LeetCode 1008
public class Question8 {

    class Solution {
        public TreeNode helper(int []preorder,int []inorder,int preLo,int preHi,int inLo,int inHi){
            if(preLo > preHi || inLo > inHi) return null;
            TreeNode root = new TreeNode(preorder[preLo]);
            int r = 0;
            while(inorder[r]!= preorder[preLo]) r++;
            int left_size = r - inLo;
            root.left = helper(preorder,inorder,preLo +1,preLo+left_size,inLo,r-1);
            root.right = helper(preorder,inorder,preLo+left_size+1,preHi,r+1,inHi);
            return root;
        }
        public TreeNode bstFromPreorder(int[] preorder) {
            int n = preorder.length;
            int [] inorder = new int[n];
            for(int i = 0;i < n ;i++){
                inorder[i] = preorder[i];
            }
            Arrays.sort(inorder);
            return helper(preorder,inorder,0,n-1,0,n-1);
        }
    }
    static void main(String[] args) {

    }
}
