package DSA.BinarySearchTree.Question;
//Most importent pls yaad kar le isko, ye inorder deta hai
public class Morris_Traversal {
    static void main(String[] args) {
        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        // Morris Traversal Inorder
        TreeNode curr = root;
        while (curr!= null){
            if(curr.left != null){
                // left hai
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    //link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{
                    // pred.right = curr: unlink
                    pred.right = null;
                    System.out.print(curr.val+" ");
                    curr = curr.right;
                }

            }
            else{
                //left nahi hai
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }
    }
}
//1 3 4 6 7 8 10 13 14