package DSA.Stack.Question;

import java.util.Stack;

public class Q2_copy_stack_into_another_stack_in_same_order {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> reverse = new Stack<>();
        while (!st.isEmpty()){
            reverse.push(st.pop());
        }
        System.out.println(reverse);
        Stack<Integer> copyStack = new Stack<>();
        while (!reverse.isEmpty()){
            copyStack.push(reverse.pop());
        }
        System.out.println(copyStack);
    }
}
//Lekin initially st mein elements hain, so st.isEmpty() → false, loop chalega hi nahi.