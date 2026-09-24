package DSA.LinkedList.Doubly_LinkedList;
//Leet Code 430
public class Flatten_a_Multilevel_Doubly_LInked_List {
    class Node {
        int val;
        Node next;
        Node prev;
        Node child;
    }
    public Node flatten(Node head) {
        Node temp = head;
        while(temp != null){
            Node n = temp.next;
            if(temp.child!=null){
                Node c = flatten(temp.child);
                Node d = c;
                while(d.next!=null){
                    d = d.next;
                }
                temp.next = c;
                c.prev = temp;
                d.next = n;
                if(n!=null)n.prev = d;
                temp.child = null;
            }
            temp = n;
        }
        return head;
    }
    // Parent node
//     ↓
// child mila
//     ↓
// flatten(child) call
//     ↓
// child list ka head = new head
//     ↓
// while(temp != null) chala
//     ↓
// child list me aur child nahi mila
//     ↓
// temp = null
//     ↓
// while loop khatam
//     ↓
// return head

    // isliye koi extra base case nahi banaya hai
    static void main(String[] args) {

    }
}
