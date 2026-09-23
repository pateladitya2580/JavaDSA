package DSA.LinkedList.questions;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class Q1 {
    /*
leet code 237. Delete Node in a Linked List// isme value delete karni hai
// na ki node
 */

    public class delete_node_in_a_linkedList {
        class Solution {
            public void deleteNode(ListNode node) {
                node.val = node.next.val;
                node.next = node.next.next;
            }
        }
        static void main(String[] args) {

        }
    }
}
