package DSA.LinkedList.questions;
// Leet code 19. Remove Nth Node From End of List
public class Remove_Nth_Node_from_end_of_list {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp = head;
        // int len =0;
        // while(temp != null){
        //     temp = temp.next;
        //     len++;
        // }
        // // n from end = (len - n + 1) from start
        // if(n == len){
        //     head = head.next;
        //     return head;
        // }
        // int position = len - n + 1;//position, position-1 us position ka index
        // temp = head;
        // for(int i = 0 ;i< position-2;i++){//
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;

        //METHOD 2

        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0 ;i< n ;i++){//move 'fast' n steps ahead
            fast = fast.next;
        }
        if(fast == null){//n==len
            //i have to delete the head
            return head.next;
        }
        while(fast.next != null){//move 'slow' and fast together till fast.next != null
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    static void main(String[] args) {

    }
}
