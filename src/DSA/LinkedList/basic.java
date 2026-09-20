package DSA.LinkedList;

import java.util.LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class basic {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void printRecursive(Node head){
        if(head == null) return;//base case
        System.out.println(head.val);
        printRecursive(head.next);
    }
    static void main(String[] args) {
        Node a = new Node(10);//head node
//        System.out.println(a.val);
//        System.out.println(a.next);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next = b;//linking => a -> b
        b.next = c;//a -> b -> c
        System.out.println();
//
//        System.out.println(a.val);
//        System.out.println(a.next.val);//b.val
//        System.out.println(a.next.next.val);//c.val

        //printing using loop
//        Node temp = a;// a head hai kyo ki first element hai
//        while (temp != null){
//            System.out.println(temp.val+" ");
//            temp = temp.next;//forward moving
//        }
       //print(a);
        printRecursive(a);

    }
}
/*
* Shallow copy: naya outer object banta hai, andar ke reference-type objects
  purane wale hi rehte hain.

* Deep copy: naya outer object + andar ke referenced objects ki bhi nayi
  copies banti hain.
------------------------------------------------------------------------------
  Conceptually:
Shallow:
p1 ──────→ Person A
             ↓
           Address A
             ↑
p2 ──────→ Person B

Person A aur Person B alag
Address A same
------------------------------------------------------------------------------
Deep:

p1 ──────→ Person A
             ↓
           Address A

p2 ──────→ Person B
             ↓
           Address B
------------------------------------------------------------------------------------
So shortcut:

Shallow = outer new, inner reference old.
Deep = outer new, inner objects bhi new.
 */
