package DSA.LinkedList.questions;
//leet code 141  Linked List Cycle
public class Q6_Linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // if(head == null) return false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    static void main(String[] args) {

    }
}
