package DSA.LinkedList.questions;
// Leet code 725
public class Q17_Split_Linked_List_in_parts {
    public int lengthOfList(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = lengthOfList(head);
        int size = n/k;// n/k+1
        int extra = n%k;
        /*
        man ke chalo example hai
        1 2 3 4 5 6 7 8 9 10 11 isko 3 parts me todna hai or parts same ho
        ya 1 ka differn ho to phir ham aese karenge
        phele 4
        dushre 4
        phir 3
        abb ye do bar char lena ye kese pata chalega n%k se
        yadi n ke se complete divide ho jata to itna sochna nahi padta
        */
        ListNode[] arr = new ListNode[k];
        int idx = 0;
        ListNode temp = head;
        int len = 1;
        while(temp!=null){
            int s = size;
            if(extra > 0) s++;
            if(len == 1) arr[idx++] = temp;
            if(len == s){
                ListNode a = temp.next;
                temp.next = null;
                temp = a;
                len = 1;
                extra--;
            }
            else{
                len++;
                temp = temp.next;
            }
        }
        return arr;
    }
    static void main(String[] args) {

    }
}
