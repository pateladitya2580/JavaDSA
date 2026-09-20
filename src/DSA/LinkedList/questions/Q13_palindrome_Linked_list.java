package DSA.LinkedList.questions;
//Leet Code 234
public class Q13_palindrome_Linked_list {
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode pre = null;
        ListNode Next = null;
        while(curr!=null){
            Next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = Next;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
       // METHOD 1 BY MAKING DEEP COPY
//        if(head.next == null) return true;
//        //create a deep copy
//        ListNode newHead = new ListNode(head.val);
//        ListNode temp1 = head.next;
//        ListNode temp2 = newHead;
//        while(temp1 != null){
//            ListNode y = new ListNode (temp1.val);
//            temp2.next = y;
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
//        newHead = reverseList(newHead);
//        temp1 = head;
//        temp2 = newHead;
//        while(temp1 != null){
//            if(temp1.val!=temp2.val) return false;
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
//        return true;
        //METHODE 2
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode j = reverseList(slow);
        ListNode i = head;
        while(j!=null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
    static void main(String[] args) {

    }
}
