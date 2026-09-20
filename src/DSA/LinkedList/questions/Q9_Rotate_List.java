package DSA.LinkedList.questions;
//Leet code 61 Given the head of a linked list, rotate the list to the
// right by k places.
public class Q9_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode x = head;
        int n = 0;
        while (x!=null){
            x = x.next;
            n++;
        }
        k = k%n;
        if(k == 0) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        for(int i = 1 ;i<=k;i++){
            fast = fast.next;
        }
        while( fast.next !=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
    }
    static void main(String[] args) {

    }
}
