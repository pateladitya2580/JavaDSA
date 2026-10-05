package DSA;

public class adi01 {
    static class Node{
        int val ;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();


    }
}
