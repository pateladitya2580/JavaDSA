package DSA.LinkedList.questions;
// leet code 876. Middle of the Linked List
public class Q2_Middle_of_the_LInkedList {
    public ListNode middleNode(ListNode head) {
        // int len =0;
        // ListNode temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     len++;
        // }
        // int mid = len/2 + 1;
        // temp = head;
        // for(int i = 1 ;i<= mid-1;i++){
        //     temp = temp.next;
        // }
        // return temp;

        //one pass solution /without finding the length/slow-fast approach
        ListNode slow = head;
        ListNode fast = head;
        //null ka next nahi hota
        while(fast != null && fast.next != null){//right middle
            slow = slow.next;// for left middle while(fast.next != null && fast.next.next != null)
            fast = fast.next.next;
        }
        return slow;

    }
    static void main(String[] args) {

    }
}
