package DSA.Stack.Question;

import java.util.Stack;

public class Q4_Push_element_at_bottom_or_any_index {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //push 100 at 2;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>=2){
            temp.push(st.pop());
        }
        st.push(100);
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
/*
Jis index par element insert karna hai, us index ke upar wale saare
elements ko temporary stack me shift karo. Jab original stack ki size
target index ke equal ho jaye, new element push karo. Phir temporary
stack ke elements ko wapas original stack me push kar do.
 */