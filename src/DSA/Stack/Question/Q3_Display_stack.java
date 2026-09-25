package DSA.Stack.Question;

import java.util.Stack;

public class Q3_Display_stack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);// aese me stack rahega
        System.out.println(st.size());

        while (!st.isEmpty()){// stack empty ho jayega isme
            System.out.print(st.pop()+" ");// reverse order me print hoga
        }
        System.out.println();
        System.out.println(st.size());
    }
}
