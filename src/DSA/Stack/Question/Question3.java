package DSA.Stack.Question;
import java.util.Stack;
//Display stack
public class Question3 {
    public static void printStack(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        printStack(st);
        System.out.print(top+" ");// 10 to 50
        st.push(top);
    }

    public static void printStack_Bottom_To_Top(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");//50 to 10
        printStack_Bottom_To_Top(st);
        st.push(top);
    }
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

//        Stack<Integer> temp = new Stack<>();
//        while (st.size()>0){
//            temp.push(st.pop());
//        }
//
//        while (temp.size()>0){
//            int top = temp.pop();
//            System.out.print(top +" ");
//            st.push(top);
//        }

        printStack(st);
        System.out.println();
        printStack_Bottom_To_Top(st);
    }
}
