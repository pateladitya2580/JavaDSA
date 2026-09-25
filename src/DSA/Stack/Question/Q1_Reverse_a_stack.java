package DSA.Stack.Question;
import java.util.Stack;
public class Q1_Reverse_a_stack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> reverse = new Stack<>();
        while (st.size()>0){
            reverse.push(st.pop());// int ele = st.pop();
        }                          // reverse.push(ele);
        System.out.println(reverse);
    }
}
