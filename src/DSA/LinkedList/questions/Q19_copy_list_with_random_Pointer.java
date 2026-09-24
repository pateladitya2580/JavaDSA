package DSA.LinkedList.questions;
//Leet code 138
class Node {
    int val;
    Node next;
    Node random;
    Node(int val){
        this.val = val;
    }
}
public class Q19_copy_list_with_random_Pointer {
    public Node deepCopy(Node head){
        Node head2 = new Node(head.val);
        Node temp2 = head2 ;
        Node temp = head.next;
        while(temp!=null){
            Node y = new Node(temp.val);
            temp2.next =y;
            temp2 = temp2.next;
            temp =  temp.next;
        }
        return head2;
    }
    public void connectAlternatively(Node head,Node head2){
        Node dummy = new Node (-1);
        Node temp = dummy;
        Node temp1 = head;
        Node temp2 = head2;
        while(temp1!=null && temp2 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }
    public void split(Node head,Node head2){
        Node temp1 = head;
        Node temp2 = head2;
        while(temp1!= null){
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1 == null) break;
            temp2.next = temp1.next;
            temp2 = temp2.next;
        }
    }
    public void assignRandom(Node head,Node head2){
        Node temp1 = head;
        Node temp2 = head2;
        while(temp1!=null){
            if(temp1.random != null) temp2.random = temp1.random.next;
            temp1 = temp1.next.next;
            if(temp1 == null)break;
            temp2 = temp1.next;
        }
    }
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        //Step 1 create deep copy
        Node head2 = deepCopy(head);
        //Step 2 Join these linked list alternatively
        connectAlternatively(head,head2);
        //Step 3 Assign random pointers
        assignRandom(head,head2);
        //Step 4 : Split the Linked List
        split(head,head2);
        return head2;
    }
    static void main(String[] args) {

    }
}
