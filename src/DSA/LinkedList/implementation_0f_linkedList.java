package DSA.LinkedList;
//Node ki class main code ke bahar banai hai islye pure folder me use kar
//sakte hai yadi file basic ke ander hoti to use nahi kar pate,kisi or
//file me same folder me
/*
GET(index)
→ mujhe index wali node chahiye
→ i < index

INSERT(index)
→ mujhe index se ek pehle wali node chahiye
→ i < index - 1

i ko index mat samjho. Is context mein i basically moves/iterations count
kar raha hai.

Maan lo:

index:  0     1     2     3
       10 → 20 → 30 → 40
        ↑
       temp

temp already index 0 par hai.
 */
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
    void insert(int idx,int val){
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
        for (int i = 0; i < idx-1; i++) {//0 base indexing
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
        for (int i = 0; i < idx ; i++) {
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
        for (int i = 0; i < idx ; i++) {
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
        for (int i = 0; i < idx-1; i++) {
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
🔹 Linked List: i = 0 se for loop ka Logic

Maan lo:

Index:   0     1     2     3     4
        [10] → [20] → [30] → [40] → [50]
         ↑
        temp

temp = head hai, isliye temp already index 0 par hai.

सबसे important point

i = index nahi hai.

i = ab tak ki loop iterations / moves ko count karta hai.

i = 0 → abhi 0 moves
i = 1 → 1 move complete/next iteration
i = 2 → 2 moves...
1️⃣ Exact idx wali Node chahiye

Suppose:

idx = 3

Hume index 3 wali node [40] chahiye.

Starting:

temp
 ↓
10 → 20 → 30 → 40
0     1     2     3

Index 0 → index 3 jaane ke liye:

0 → 1 → 2 → 3
    ↑    ↑    ↑
   1st  2nd  3rd move

Total 3 moves.

Isliye:

for(int i = 0; i < idx; i++) {
    temp = temp.next;
}
idx = 3 डालकर:
for(int i = 0; i < 3; i++)

i ki values:

i = 0 → 1st move → index 1
i = 1 → 2nd move → index 2
i = 2 → 3rd move → index 3

So:

i = 3 ❌

loop nahi chalega.

Therefore:

Exact idx wali node par jaana ho → i < idx

2️⃣ idx - 1 wali Node chahiye

Ab maan lo:

idx = 3

Lekin hume idx se ek previous node chahiye.

idx = 3
idx - 1 = 2

Target:

Index:   0     1     2     3
        [10] → [20] → [30] → [40]
                      ↑
                    temp

Index 0 → index 2:

0 → 1 → 2
    ↑    ↑
   1st  2nd move

Total 2 moves.

Isliye:

for(int i = 0; i < idx - 1; i++) {
    temp = temp.next;
}
idx = 3 डालकर:
for(int i = 0; i < 2; i++)

Iterations:

i = 0 → 1st move → index 1
i = 1 → 2nd move → index 2

Ab temp index 2 par hai.

Therefore:

idx se ek previous node par jaana ho → i < idx - 1

3️⃣ idx - 2 wali Node chahiye

Same logic.

idx = 4
idx - 2 = 2

Starting index 0 se index 2 tak:

0 → 1 → 2
    1   2 moves

So:

for(int i = 0; i < idx - 2; i++)
🧠 Main Formula

temp = head hone par:

Target	Required moves	Loop
Exact idx	idx	i < idx
idx - 1	idx - 1	i < idx - 1
idx - 2	idx - 2	i < idx - 2
idx - k	idx - k	i < idx - k
Why <?

Kyuki i 0 se start hota hai.

Agar 3 moves chahiye:

i = 0
i = 1
i = 2

Total = 3 iterations

Isliye:

i < 3

Agar:

i <= 3

to:

i = 0
i = 1
i = 2
i = 3

Total = 4 iterations ❌
 */
