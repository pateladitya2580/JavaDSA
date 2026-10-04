package DSA.BinaryTrees.Question;

public class Question4 {
    private static int sum(Node root){
        if(root == null) return 0;
        int suM = root.val + sum(root.left) + sum(root.right);
        return suM;
    }

    public static int MaxValue(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val, b = MaxValue(root.left),c = MaxValue(root.right);
        int max = Math.max(a,Math.max(b,c));
        return max;
    }

    public static int MinValue(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val, b = MinValue(root.left),c = MinValue(root.right);
        int min = Math.min(a,Math.max(b,c));
        return min;
    }

    public static int sizeOfTree(Node root){
        if(root == null) return 0;
        int size = 1 + sizeOfTree(root.left)+sizeOfTree(root.right);
        return size;
    }

    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static int levels(Node root){
        if(root == null) return 0;
        int lev = 1 + Math.max(levels(root.left),levels(root.right));
        return lev;
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

        display(a);
        System.out.println();
        System.out.println("Sum is "+sum(a));

        System.out.println("Maximum is  "+MaxValue(a));

        System.out.println("Minimum is "+MinValue(a));

        System.out.println("The size is "+sizeOfTree(a));

        System.out.println("The levels are "+levels(a));
    }
}
