package DSA.Stack.Question;
import  java.util.*;
//check whether a given bracket sequence is balanced or not
public class Question5 {
    public static boolean isBalanced(String str ){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else {
                // ch == ')'
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        if(st.size() > 0) return false;
        return true;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brackets");
        String str = sc.nextLine();
        System.out.println("String is balance "+isBalanced(str));
    }
}
