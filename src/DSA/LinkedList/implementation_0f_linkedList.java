package DSA.LinkedList;
//Node ki class main code ke bahar banai hai islye pure folder me use kar
//sakte hai yadi file basic ke ander hoti to use nahi kar pate,kisi or
//file me same folder me
//===========================================================================
class SLLimplementation{// user defined data structure
    Node head;// by default null
    Node tail;// by default null
    int size;// by default zero
    void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtEnd( int val){
        Node temp = new Node(val);
        if(head == null) head = tail= temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtBeginning(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = null;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx,int val){// 0 base indexing use kar rahe hai yadi 1 base mention hota to wo karte
        Node temp = new Node(val);
        if(idx == 0){
            insertAtBeginning(val);
            return;
        }
        if(idx == size){
            insertAtEnd(val);
            return;
        }
        if(idx>size || idx < 0){
            System.out.println("Invalid index !!");
            return;
        }
        Node x = head;
        //Linked List me i index nahi hota. Usually i ek loop counter / iteration
        // counter hota hai, jo batata hai ki loop kitni baar execute hua.
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;
        }
        //insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx){
        if(idx == 0) return head.val;
        if(idx == size-1) return tail.val;
        if(idx >= size || idx< 0 ){
            System.out.println("Invalid index!!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val){
        if(idx == 0) {
            head.val= val;
            return;
        }
        if(idx == size-1){
            tail.val= val;
            return;
        }
        if(idx >= size || idx< 0 ){
            System.out.println("Invalid index!!");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("Empty linked list ");
        }
        head = head.next;
        size--;
    }
    void delete(int idx){
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(head == null) {
            System.out.println("Empty linked lis");
            return;
        }
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next;
        }
        if(temp.next == tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
    void size(){
        System.out.println("Size is :"+size);
    }
}
public class implementation_0f_linkedList {
    static void main(String[] args) {
        SLLimplementation list = new SLLimplementation();
        list.size();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insert(2,100);
        System.out.println(list.getElement(2));
        list.print();
        list.size();
        list.delete(4);
        list.print();
    }
}
/*
linklist me khali ye dekho loop kitni baar chalana hai or i koi index
nahi hai,wo sirh ye bata raha hai ki loop kitni barr chal raha hai
 */
