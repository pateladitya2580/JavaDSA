package DSA.LinkedList.questions;
//Leet code 206
public class Q12_Reverse_Linked_List {
    //Method 1;
    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode curr = head;
//        ListNode prev = null;
//        ListNode Next = null;
//        while(curr != null){
//            Next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = Next;
//        }
//        return prev;
    //Method 2;
     if(head == null || head.next == null) return head;
    ListNode a = head.next;
    ListNode nh = reverseList(a);
    a.next = head;
    head.next = null;
    return nh;
    }
    static void main(String[] args) {

    }
}
