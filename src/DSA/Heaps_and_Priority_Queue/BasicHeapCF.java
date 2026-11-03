package DSA.Heaps_and_Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
/*
priority queue me ek bari me ek hi element ko
use kar sakte ho
 */
public class BasicHeapCF {
    static void main(String[] args) {
        System.out.println("Min Heap");

        PriorityQueue<Integer> pq = new PriorityQueue<>();// Min Heap
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        pq.add(-34);
        System.out.println(pq+" "+pq.peek());

        System.out.println("Max Heap");

        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());// Max Heap
        p.add(2);
        System.out.println(p+" "+p.peek());
        p.add(10);
        System.out.println(p+" "+p.peek());
        p.add(1);
        System.out.println(p+" "+p.peek());
        p.remove();
        System.out.println(p+" "+p.peek());
        p.add(0);
        System.out.println(p+" "+p.peek());
        p.add(-34);
        System.out.println(p+" "+p.peek());
    }
}
/*
HEAP

- Heap ek Complete Binary Tree (CBT) hai jo Heap Property follow karta hai.
- Heap ko generally Array mein implement kiya jata hai.
- Heap ke 2 types hote hain:

        1. Max Heap:
        - Parent >= Children
        - Root par maximum element hota hai.

        2. Min Heap:
        - Parent <= Children
        - Root par minimum element hota hai.

Heap Operations:
- Insertion: O(log n)
- Deletion: O(log n)
- Peek: O(1)
- Searching: O(n)
- Build Heap: O(n)


PRIORITY QUEUE (PQ)

- Priority Queue ek Abstract Data Type (ADT) hai.
        - Isme elements insertion order ke bajay priority ke according process hote hain.
        - Isko Array, Linked List ya Heap se implement kar sakte hain.
        - Heap iska sabse common aur efficient implementation hai.

Types:

        1. Min Priority Queue:
        - Sabse chhote element ki highest priority hoti hai.

        2. Max Priority Queue:
        - Sabse bade element ki highest priority hoti hai.


JAVA IMPLEMENTATION

1. Min Priority Queue (Default):

PriorityQueue<Integer> pq = new PriorityQueue<>();

2. Max Priority Queue:

PriorityQueue<Integer> pq =
        new PriorityQueue<>(Collections.reverseOrder());


IMPORTANT METHODS

- add() / offer() : Element insert karna.
- peek()          : Highest-priority element dekhna.
- poll()/remove() : Highest-priority element remove karna.
- size()          : Total elements count karna.
- isEmpty()       : Check karna ki PQ empty hai ya nahi.


IMPORTANT DIFFERENCE

- Heap = Data Structure
- Priority Queue = ADT
        - Java PriorityQueue = Heap-based implementation


TIME COMPLEXITY (Heap-based PQ)

- Insertion: O(log n)
- Peek: O(1)
- Deletion: O(log n)

====================================================================================

HEAP → PRIORITY QUEUE

1. Min Heap → Min Priority Queue

- Min Priority Queue ko Min Heap se implement kiya jata hai.
- Min Heap mein smallest element root par hota hai.
- Smallest element ko highest priority milti hai.
- peek() → Smallest element return karta hai.


2. Max Heap → Max Priority Queue

- Max Priority Queue ko Max Heap se implement kiya jata hai.
- Max Heap mein largest element root par hota hai.
- Largest element ko highest priority milti hai.
- peek() → Largest element return karta hai.
===================================================================================

Problem Identification

1) Kth smallest / largest / closest / frequent / k-sorted array
   Out of n, if we are working on 'k' elements

2) O(n log n) < O(n log k) < O(n)

3) Minimize, Maximize, [continuous sorting]

4) for k smallest -> we use MaxHeap

aese cases me generally heap use hota hai

*/