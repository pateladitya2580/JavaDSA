package DSA.Queue;
import java.util.*;
public class Dequeue {
    static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);

        System.out.println(dq);

        dq.addFirst(6);
        dq.addFirst(7);
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

//        dq.add(12) ;// last me add
//        dq.remove();//first se remove
    }
}
