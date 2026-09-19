package DSA.LinkedList.questions;
// Leet code 83  Remove Duplicates from Sorted List
public class Q8_Remove_Duplicates_from_sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        //   ListNode temp = head;
        //   if(head == null) return null;
        //   while(temp != null && temp.next != null){
        //     if(temp.val == temp.next.val){
        //         temp.next = temp.next.next;
        //     }
        //     else{
        //         temp = temp.next;
        //     }
        //   }
        //   return head;

        //METHOD 2
        if(head == null) return null;
        ListNode a = head;
        ListNode b = head;
        while(b!= null){
            if(a.val == b.val){
                b = b.next;
            }
            else{
                a.next = b;
                a = b;
            }
        }
        a.next = null;
        return head;
    }
    static void main(String[] args) {

    }
}
