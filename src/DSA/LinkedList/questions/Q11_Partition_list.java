package DSA.LinkedList.questions;
// leet code 86
public class Q11_Partition_list {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode y = head;
        while(y!= null){
            if(y.val<x){
                temp1.next = y;
                temp1 = temp1.next;
            }
            else{
                temp2.next = y;
                temp2 = temp2.next;
            }
            y = y.next;
        }
        temp2.next = null;
        temp1.next = dummy2.next;
        return dummy1.next;
    }
    static void main(String[] args) {

    }
}
