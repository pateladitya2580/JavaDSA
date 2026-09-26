package DSA.Stack.Question;
import java.util.Scanner;
import java.util.Stack;
// Copy/move  contents of one stack to another in same order.
public class Question1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        //INPUT BY USER
//        int n;
//        System.out.println("Enter the no. of elements");
//        n = sc.nextInt();
//        System.out.println("Enter the element of stack");
//        for(int i = 1;i<=n;i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        // reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){//st.size()>0 matlab empty stack
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack<Integer> gt = new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
