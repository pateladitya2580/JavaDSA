package DSA.LinkedList.questions;
/*
Leet code 1721. Swapping Nodes in a Linked List
 */
public class Q4_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1 ;i<=k-1;i++){
            temp = temp.next;
        }
        for(int i = 1 ;i<=k;i++){// moves nth steps ahead ,
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        int x = temp.val;
        temp.val = slow.val;
        slow.val = x;
        return head;
    }
    static void main(String[] args) {

    }
}
