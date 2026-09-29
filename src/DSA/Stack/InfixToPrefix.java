package DSA.Stack;
import java.util.Stack;
public class InfixToPrefix {
    static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = infix.length();

        for (int i = 0; i < n; i++) {
            char ch = infix.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <= 57){//0 to 9
                String s = ""+ch;
                val.push(s);
            }
            else if (op.size()==0 || op.peek()=='('|| ch =='('){
                op.push(ch);
            }
            else if(ch ==')'){
                while (op.peek() != '('){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();//'('hata diya
            }
            else{
                if(ch =='+' || ch == '-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                if(ch =='*' || ch =='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        //push
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        //val stack sizee -> 1
        while (val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);//-9/*+5346
    }
}
/*
Stack se v2 nikalo
Stack se v1 nikalo
Operator nikalo

        ↓

operator + v1 + v2

        ↓

Result val stack mein push
 */