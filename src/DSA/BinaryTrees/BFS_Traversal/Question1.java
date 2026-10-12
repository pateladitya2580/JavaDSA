package DSA.BinaryTrees.BFS_Traversal;

import java.util.Scanner;

//Print the elements of nth level
public class Question1 {
    static int n;
    public static void nthLevel(Node root,int level){
        if(root == null) return;
        if(level == n) System.out.print(root.val+" ");
        nthLevel(root.left,level+1);
        nthLevel(root.right,level+1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.println("Enter the n : ");
       // n = sc.nextInt();
        //nthLevel(a,0); isse sirf wo ek level

        for (int j = 0; j <= 3; j++) {//is se pura tree print hoga
            n = j;
            nthLevel(a,0);
        }
    }
}
