package DSA.LinkedList.Doubly_LinkedList;
class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail= temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAt(int idx,int val){// 0 base index mann rahe hai
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx > size || idx < 0){
            System.out.println("Invalid Index!!");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp;
        temp.prev = x;
        temp.next = y;
        y.prev = temp;
        size++;
    }

    void deleteAtHead(){
        if(head == null){
            System.out.println("Doubly linkedlist is empty");
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail(){
        if(head == null){
            System.out.println("Doubly linkedlist is empty");
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void deleteAtInx(int idx){
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size -1){
            deleteAtTail();
            return;
        }
        if(idx > size || idx < 0){
            System.out.println("Invalid index");
            return;
        }
        dNode temp = head;
        for (int i = 1; i <=idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;
    }
}
public class Implementation_of_doubly_LinkedList {
    static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(5);
        list.display();
        list.insertAt(3,100);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
        list.deleteAtInx(1);
        list.display();
    }

}
