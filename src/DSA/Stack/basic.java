package DSA.Stack;
import java.util.LinkedList;
import java.util.Stack;
public class basic {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());// stack follow first in last out
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size());

        //print 10
        while (st.size()>1){
            st.pop();
        }
        System.out.println(st);
    }
}
