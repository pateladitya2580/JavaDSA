package DSA.BinarySearchTree.Question;
//Deletion : The node has 0 child
public class Question9 {
    class Solution {

        // Inorder Predecessor find karna:
        // Root ke left subtree ka sabse bada node.
        // Left jao, phir rightmost node tak jao.
        public TreeNode inOrderPredesur(TreeNode root) {

            TreeNode temp = root.left;

            while (temp.right != null) {
                temp = temp.right;
            }

            return temp;
        }

        // Predecessor ke parent ko find karna.
        public TreeNode parent(TreeNode root, TreeNode predecessor) {

            // Edge Case:
            // Agar predecessor root ka direct left ya right child hai,
            // toh root hi uska parent hai.
            if (root.left == predecessor || root.right == predecessor) {
                return root;
            }

            // Predecessor left subtree ki rightmost chain mein hai.
            // Uske parent ko find karne ke liye right move karo.
            TreeNode temp = root.left;

            while (temp.right != predecessor) {
                temp = temp.right;
            }

            return temp;
        }

        public TreeNode deleteNode(TreeNode root, int key) {

            // Edge Case 1:
            // Tree empty hai ya key nahi mili.
            if (root == null) return null;

            // Key root se chhoti hai, left subtree mein search karo.
            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            }

            // Key root se badi hai, right subtree mein search karo.
            else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            }

            else {
                // Key mil gayi: ab deletion ke 3 cases.

                // Case 1: Node ke 0 children hain (Leaf Node).
                // Node ko remove karke null return karo.
                if (root.left == null && root.right == null) {
                    return null;
                }

                // Case 2: Node ka sirf 1 child hai.

                // Sirf right child present hai.
                // Right child deleted node ki jagah aa jayega.
                if (root.left == null) {
                    return root.right;
                }

                // Sirf left child present hai.
                // Left child deleted node ki jagah aa jayega.
                if (root.right == null) {
                    return root.left;
                }

                // Case 3: Node ke dono children present hain.
                // Inorder predecessor ko deleted node ki jagah lagayenge.

                TreeNode predecessor = inOrderPredesur(root);
                TreeNode predParent = parent(root, predecessor);

                // Edge Case 2:
                // Agar deleted node hi predecessor ka parent hai,
                // toh predecessor root ka direct left child hai.
                //
                // Example:
                //       5
                //      / \
                //     3   7
                //
                // 5 delete karne par predecessor = 3
                // aur predParent = 5.
                //
                // Predecessor ko original right subtree se connect karo.
                // Predecessor ka existing left child unchanged rahega.
                if (root == predParent) {
                    predecessor.right = root.right;
                    return predecessor;
                }

                // General Case:
                // Predecessor root.left ke andar deeper position par hai.
                //
                // Predecessor ka right child nahi ho sakta,
                // lekin left child ho sakta hai.
                //
                // Isliye predecessor ke parent ke right pointer ko
                // predecessor ke left child se connect karo.
                predParent.right = predecessor.left;

                // Ab predecessor ko deleted root ke dono subtrees do.
                predecessor.left = root.left;
                predecessor.right = root.right;

                // Predecessor ab naya root banega.
                return predecessor;
            }

            // Recursive call ke baad updated tree return karo.
            return root;
        }
    }

    static void main(String[] args) {

    }
}
