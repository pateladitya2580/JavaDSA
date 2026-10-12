package DSA.BinaryTrees.BFS_Traversal;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class basic {
    public static void levelOrder(Node root){// Breadth first search(BFS)
        Queue<Node> q = new LinkedList<>();
        if(root!= null) q.add(root);
        while (q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!= null) q.add(front.right);
        }
        System.out.println();
    }
    public static void display(Node a){//Depth First Search(DFS)
        if(a == null) return;
        System.out.print(a.val+" ");
        display(a.left);
        display(a.right);
    }
    static void main(String[] args) {
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
        System.out.print("PreOrder : ");
        display(a);//1 2 4 5 8 3 6 9 7

        System.out.println();
        System.out.print("LevelsOrder : ");
        levelOrder(a);
    }
}
