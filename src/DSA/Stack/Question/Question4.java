package DSA.Stack.Question;
import java.util.Stack;
// reverse a stack
public class Question4 {
    public static void insertAtBottom(Stack<Integer>st,int x ){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0){
            st.push(temp.pop());
        }
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() == 1 ) return;
        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        //Iterative Method
//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//        Stack<Integer> qt = new Stack<>();
//        while (rt.size()>0){
//            qt.push(rt.pop());
//        }
//        System.out.println(qt);
//        while (qt.size()>0){
//            st.push(qt.pop());
//        }
//        System.out.println(st);

    }
}
