package DSA.BinaryTrees.Question;
//Path Sum Three ,LeetCode 437
public class Question15 {
    class Solution {
        public int helper(Node root,long targetSum){
            if(root == null) return 0;
            int count = 0;
            if(root.val == targetSum) count++;//base case
            count += helper(root.left,targetSum-root.val) + helper(root.right,targetSum-root.val);
            return count;
        }
        public int pathSum(Node root, int targetSum) {
            if(root == null) return 0;
            return helper(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        }
    }
    static void main(String[] args) {

    }
}
/*
Algorithm: Path Sum III

1. If root == null, return 0.

        2. Create a helper function helper(root, targetSum).
Purpose: Count all downward paths that start from the
current node and have a sum equal to targetSum.

a. If root == null, return 0.

b. Initialize count = 0.

c. If root.val == targetSum, increment count.
This means the current node itself forms a valid path.

d. Recursively call helper(root.left, targetSum - root.val).
This checks paths extending into the left subtree.

e. Recursively call helper(root.right, targetSum - root.val).
This checks paths extending into the right subtree.

f. Add both recursive results to count.

g. Return count.

        3. Create the main function pathSum(root, targetSum).
Purpose: Find valid paths starting from ANY node in the tree.

a. If root == null, return 0.

b. Call helper(root, targetSum) to count valid paths
starting from the current node.

        c. Call pathSum(root.left, targetSum) to find valid paths
starting from nodes in the left subtree.

        d. Call pathSum(root.right, targetSum) to find valid paths
starting from nodes in the right subtree.

e. Add all three results and return the total.

Time Complexity: O(n²) in the worst case.
Space Complexity: O(h), where h is the height of the tree.
*/