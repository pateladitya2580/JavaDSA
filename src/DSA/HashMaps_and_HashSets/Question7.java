package DSA.HashMaps_and_HashSets;

import java.util.HashMap;

//LeetCode
public class Question7 {
    class Node{
        int val;
        Node next;
        Node random;
        Node(int val ){
            this.val = val;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if(head == null) return head;
            Node head2 = new Node (head.val);
            Node temp2 = head2;
            Node temp = head.next;
            while(temp != null){
                Node dup = new Node(temp.val);
                temp2.next = dup;
                temp2 = dup;
                temp = temp.next;
            }
            HashMap<Node,Node> map = new HashMap<>();
            temp2 = head2;
            temp = head;
            while(temp!= null){
                map.put(temp,temp2);
                temp = temp.next;
                temp2 = temp2.next;
            }

            for(Node original : map.keySet()){
                Node duplicate = map.get(original);
                if(original.random != null)
                    duplicate.random = map.get(original.random);
            }
            return head2;
        }
    }
    static void main(String[] args) {

    }
}
