package DSA.LinkedList.questions;
// leet code 876. Middle of the Linked List
public class Middle_of_the_LInkedList {
    public ListNode middleNode(ListNode head) {
        // int len =0;
        // ListNode temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     len++;
        // }
        // int n = (len/2);// (len/2)+1 uski position hai
        //  temp = head;
        // for(int i = 0;i<n;i++){
        //     temp = temp.next;
        // }
        // return temp;

        //one pass solution /without finding the length/slow-fast approach
        ListNode slow = head;
        ListNode fast = head;
        //null ka next nahi hota
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    static void main(String[] args) {

    }
}
