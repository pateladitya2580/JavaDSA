package DSA.Queue;

import java.util.Queue;

public class LinkedListImplementationOfQueue {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL{
        Node head;
        int size = 0;
        void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = temp;
            }
            else{
                Node tail = head;
                while (tail.next != null){
                    tail = tail.next;
                }
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void display(){
            if(size == 0 ){
                System.out.println("Queue is empty");
                return;
            }
           Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int remove(){
            if(size == 0){
                System.out.println("Queue is empty!!");
                return -1;
            }
            int ans = head.val;
            head = head.next;
            size--;
            return ans;
        }

        int peek(){
            if(size == 0){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size == 0 ) return true;
            else return false;
        }
    }
    static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.size);
        System.out.println(q.isEmpty());
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
