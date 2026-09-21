package DSA.LinkedList.questions;
//Leet code 143
public class Q15_Reorder_List {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode pre = null;
        ListNode Next = null;
        while(curr!= null){
            Next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = Next;
        }
        return pre;
    }
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode leftMiddle = middleNode(head);
        ListNode head2 = leftMiddle.next;
        leftMiddle.next = null;
        head2 = reverse(head2);
        ListNode Dummy = new ListNode (1);
        ListNode temp1 = Dummy;
        while(head != null && head2 !=null ){
            temp1.next = head;
            temp1 = temp1.next;
            head = head.next;

            temp1.next = head2;
            temp1 = temp1.next;
            head2 = head2.next;
        }
        if(head2== null) temp1.next = head;
        if(head==null) temp1.next = head2;
        head = Dummy.next;
    }
    static void main(String[] args) {

    }
}