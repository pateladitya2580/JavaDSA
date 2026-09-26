package DSA.Stack.Question;
import java.util.Scanner;
import java.util.Stack;
//Insert at bottom / any index
public class Question2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println("Enter the idx");
        int idx = sc.nextInt();
        System.out.println("Enter the val");
        int val = sc.nextInt();
        Stack<Integer>temp = new Stack<>();
        while (st.size()>idx){//0 base indexing man kar solve kar rahe hai
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
 //       Zero-based: while (st.size() > index)
 //       One-based: while (st.size() >= index)
