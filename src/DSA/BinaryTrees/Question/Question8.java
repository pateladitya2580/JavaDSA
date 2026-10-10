package DSA.BinaryTrees.Question;
//Diameter of Binary Tree .LeetCode 543
/*
### Diameter of Binary Tree

**Definition:** Diameter is the length of the longest path between any two nodes in a binary tree, measured by the number of edges.

# Algorithm
1. If `root == null`, return `0`.
2. Calculate the diameter passing through the current node:
   `myDia = levels(root.left) + levels(root.right)`
3. Recursively calculate the left subtree diameter:
   `lefDia = diameterOfBinaryTree(root.left)`
4. Recursively calculate the right subtree diameter:
   `rightDia = diameterOfBinaryTree(root.right)`
5. Return the maximum of all three values:
   `Math.max(myDia, Math.max(lefDia, rightDia))`

### Logic
The longest path can pass through the current node, lie entirely in the left subtree, or lie entirely in the right subtree. Compare all three possibilities and return the maximum.

### Complexity
- **Time:** `O(n²)` worst case, because `levels()` may traverse subtrees repeatedly.
- **Space:** `O(h)` for the recursion stack, where `h` is the height of the tree.
 */

class Solution {
    public int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public int diameterOfBinaryTree(Node root) {
        if(root == null) return 0;
        int myDia = (levels(root.left) + levels(root.right) + 1) -1;
        int lefDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        return Math.max(myDia,Math.max(lefDia,rightDia));
    }
}
public class Question8 {

}
