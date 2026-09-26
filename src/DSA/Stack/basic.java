package DSA.Stack;
import java.util.Stack;
public class basic {
    static void main(String[] args) {
       Stack<Integer> st = new Stack<>();//LIFO last in first out
        System.out.println(st.isEmpty());
        st.push(10);//Stack mein push() hamesha element ko TOP par add karta hai.
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        System.out.println(st.peek());// peek top element deta hai bina remove ke

        System.out.println(st.pop());//pop se top element milta hai but wo remove ho
        System.out.println(st);//jata hai stack se

        System.out.println("size is "+ st.size());
    }
}
