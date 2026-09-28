package DSA.Stack;

public class linked_list_implementation_of_Stacks {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek(){
            if(head == null){
                System.out.print("Stack is empty");
                return -1;
            }
            return head.val;
        }

        int pop(){
            if(head == null){
                System.out.print("Stack is empty");
                return -1;
            }
            int ans = head.val;
            head = head.next;
            size--;
            return ans;
        }

        int  Size(){
            return size;
        }

        void displayrec(Node h){//helper funtion
            if(h == null ) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }

        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
    }
    static void main(String[] args) {
       Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
        System.out.println("Peek is "+ st.peek());
        st.pop();
        st.pop();
        st.display();
        System.out.println("Size is "+st.Size());
    }
}
