package DSA.LinkedList.questions;
//Leet code 21
/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by
splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */
public class Q10_Merge2_sorted_lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(100);
        ListNode temp = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            }
            else{
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        return dummy.next;
    }
    static void main(String[] args) {

    }
}
