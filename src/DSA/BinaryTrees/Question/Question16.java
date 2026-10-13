package DSA.BinaryTrees.Question;
//Construct Binary Tree from Preorder and Inorder Traversal ,LeetCode 105
public class Question16 {
    class Solution {
        public Node helper(int[]preorder,int[]inorder,int preLo,int preHi,int inLo,int inHi){
            if(preLo>preHi || inLo >inHi) return null;
            Node root = new Node(preorder[preLo]);
            int r = 0;
            while(inorder[r]!= preorder[preLo]) r++;
            int leftSize = r - inLo;
            root.left = helper(preorder,inorder,preLo + 1,preLo + leftSize,inLo,r-1);
            root.right = helper(preorder,inorder,preLo+leftSize+1,preHi,r+1,inHi);
            return root;
        }
        public Node buildTree(int[] preorder, int[] inorder) {
            int n = preorder.length;
            return helper(preorder,inorder,0,n-1,0,n-1);
        }
    }
    static void main(String[] args) {

    }
}

/*
Approach: Construct Binary Tree from Preorder and Inorder
LeetCode 105

1. Helper Function:
   - preorder aur inorder arrays pass karo.
   - preLo, preHi -> Current preorder range.
   - inLo, inHi   -> Current inorder range.

2. Base Case:
   - Agar preLo > preHi OR inLo > inHi ho,
     toh null return karo.
   - Iska matlab current subtree empty hai.

3. Root Create Karo:
   - Preorder ka order: Root -> Left -> Right.
   - Isliye preorder[preLo] current subtree ka root hoga.
   - Is value se naya TreeNode banao.

4. Inorder Mein Root Search Karo:
   - Inorder array mein root ki position search karo.
   - Searching inLo se start karo.
   - Root ka index r mein store karo.
   - Inorder ka order: Left -> Root -> Right.
   - r se pehle ke elements left subtree ke honge.
   - r ke baad ke elements right subtree ke honge.

5. Left Subtree Ka Size:
   - leftSize = r - inLo
   - Isse left subtree ke nodes ki count pata chalegi.

6. Left Subtree Construct Karo:
   - Recursively helper() call karo.
   - Preorder range: preLo + 1 to preLo + leftSize.
   - Inorder range: inLo to r - 1.
   - Returned subtree ko root.left mein attach karo.

7. Right Subtree Construct Karo:
   - Recursively helper() call karo.
   - Preorder range: preLo + leftSize + 1 to preHi.
   - Inorder range: r + 1 to inHi.
   - Returned subtree ko root.right mein attach karo.

8. Root Return Karo:
   - Dono subtrees construct hone ke baad root return karo.

9. Main Function buildTree():
   - n = preorder.length calculate karo.
   - helper(preorder, inorder, 0, n-1, 0, n-1) call karo.
   - Constructed binary tree return karo.

Time Complexity: O(n^2) worst case.
Space Complexity: O(h), where h is the height of the tree.

Note: Sabhi node values unique honi chahiye.
*/
