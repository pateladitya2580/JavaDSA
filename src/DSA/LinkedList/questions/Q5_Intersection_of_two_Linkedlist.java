package DSA.LinkedList.questions;
// leet code 160. Intersection of Two Linked Lists
public class Q5_Intersection_of_two_Linkedlist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0, lenB =0 ;
        while(tempA!=null){
            tempA = tempA.next;
            lenA++;
        }
        while(tempB!=null){
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB;
        int lenDiff = 0;
        if(lenA>lenB){
            lenDiff = lenA - lenB;
            while(lenDiff > 0){
                tempA = tempA.next;
                lenDiff--;
            }
        }
        else if (lenA<lenB){
            lenDiff =  lenB - lenA;
            while(lenDiff > 0){
                tempB = tempB.next;
                lenDiff--;
            }
        }
        while(tempA != null){
            if(tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }
            else{
                return tempA;
            }
        }
        return null;
    }
    static void main(String[] args) {

    }
}
