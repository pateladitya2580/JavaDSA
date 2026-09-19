package DSA.LinkedList.questions;
// leet code 142  Linked List Cycle II
public class Q7_Linked_List_Cycle_2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast != slow) return null;
        ListNode temp = head;
        while(temp != slow){
            slow = slow .next;
            temp = temp.next;
        }
        return temp;
    }
    static void main(String[] args) {

    }
}
