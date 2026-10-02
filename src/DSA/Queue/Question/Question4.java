package DSA.Queue.Question;
import java.util.Stack;
//Implement queue using stacks Leet code 232
public class Question4 {
    class MyQueue {
        // jab aap same queue me remove kar ke usme hi add karte ho to size change nahi hota
        // par aap jav stack me se val nikalte ho or add nahi karte ho to size chane hota hai
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        public MyQueue() {

        }

        public void push(int x) {
            st.push(x);
        }

        public int pop() {
            while(st.size()>1){
                gt.push(st.pop());
            }
            int x = st.pop();
            while(gt.size()>0){
                st.push(gt.pop());
            }
            return x;
        }

        public int peek() {
            while(st.size()>1){
                gt.push(st.pop());
            }
            int x = st.peek();
            while(gt.size()>0){
                st.push(gt.pop());
            }
            return x;
        }

        public boolean empty() {
            if(st.size()== 0) return true;
            else return false;
        }
    }
    static void main(String[] args) {

    }
}
