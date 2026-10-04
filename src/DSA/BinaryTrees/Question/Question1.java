package DSA.BinaryTrees.Question;
// Find sum of tree nodes
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Question1 {
    private static void display(Node root){
        if(root == null) return;//base case
        System.out.print(root.val+" ");//self
        display(root.left);// left subTree
        display(root.right);// right subTree
    }

    private static int sum(Node root){
        if(root == null) return 0;
        int suM = root.val + sum(root.left) + sum(root.right);
        return suM;
    }

    private static  int product(Node root){
        if(root == null) return 1;
        int product = root.val * product(root.left)* product(root.right);
        return product;
    }
    static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = h;
        c.left = g; c.right =f;
        int x = 0;
        int ans = sum(a);
        int product = product(a);
        display(a);
        System.out.println();
        System.out.println("Sum is "+ans);
        System.out.println("Product is "+product);
    }
}
