package DSA.Queue;
import java.util.*;
public class Basic {
    static void main(String[] args) {
        //Queue<Integer> q = new ArrayDeque<>(); dono option hai
        Queue<Integer> q = new LinkedList<>();//FIFO
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();// ye bhi remove hi karta hai
        System.out.println(q);
        System.out.println(q.element());// ya bhi q.peek(); deta hai

    }
}
