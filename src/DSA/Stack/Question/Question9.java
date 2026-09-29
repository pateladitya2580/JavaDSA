package DSA.Stack.Question;
import java.util.*;
//Leet code 155
public class Question9 {
    class MinStack {
        Stack<Integer>st = new Stack<>();
        Stack<Integer>min = new Stack<>();
        public MinStack() {
            //constractor
        }

        public void push(int value) {
            if(st.size()==0){
                st.push(value);
                min.push(value);
            }
            else{
                if(min.peek() < value){
                    st.push(value);
                    min.push(min.peek());
                }
                else{
                    st.push(value);
                    min.push(value);
                }
            }
        }

        public void pop() {
            st.pop();
            min.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
    static void main(String[] args) {

    }
}
