package DSA.Queue.Question;
import java.util.*;
import java.util.LinkedList;

//Implementation Stack using queues Leet code 225
public class Question3 {
    class MyStack {
        Queue<Integer> q = new LinkedList<>();
        int size = 0;
        public MyStack() {

        }

        public void push(int x) {
            q.add(x);
            size++;
        }

        public int pop() {
            for(int i = 1 ;i<= q.size()-1;i++){
                q.add(q.remove());
            }
            int x = q.remove();
            size--;
            return x;
        }

        public int top() {
            for(int i = 1 ;i<= q.size()-1;i++){
                q.add(q.remove());
            }
            int x = q.remove();
            q.add(x);
            return x;
        }

        public boolean empty() {
            if(size == 0) return true;
            else return false;
        }
    }
    static void main(String[] args) {

    }
}
