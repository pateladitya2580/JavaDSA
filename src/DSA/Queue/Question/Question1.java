package DSA.Queue.Question;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//Print all the elements present in given queue only using add(),remove()
//peek(),size() and extra queue;
public class Question1 {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //rear-> 5 4 3 2 1 -> front
        Queue<Integer> s = new ArrayDeque<>();
        while (q.size()>0){
            System.out.print(q.peek()+" ");
            s.add(q.poll());
        }

        while (s.size()>0){
            q.add(s.poll());
        }
    }
}
/*
Dono first element ko remove karte hai
poll()   → remove + return → empty ho to null
remove() → remove + return → empty ho to Exception
 */