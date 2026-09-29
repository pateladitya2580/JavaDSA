package DSA.Stack.ExpressionConversionAndEvalution;
import java.util.Stack;
public class infix {
    static void main(String[] args) {
        String str = "9-(5+3)*4/6";//4
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <= 57){
                val.push(asci - 48);
            }
            else if (op.size()==0 || op.peek()=='('|| ch =='('){
                op.push(ch);
            }
            else if(ch ==')'){
                while (op.peek() != '('){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();//'('hata diya
            }
            else{
                if(ch =='+' || ch == '-'){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                if(ch =='*' || ch =='/'){
                   if(op.peek()=='*'||op.peek()=='/'){
                       //work
                       int v2 = val.pop();
                       int v1 = val.pop();
                       if(op.peek() == '*') val.push(v1*v2);
                       if(op.peek() == '/') val.push(v1/v2);
                       op.pop();
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
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
/*
Infix Evaluation — Improved Theory

Agar character number hai, to usse directly val stack mein push karo.

Agar character ( hai, to usse directly op stack mein push karo, kyunki
bracket ke andar ka expression pehle solve hoga.

Agar character operator (+,-,*,/) hai, to sabse pehle op stack check karo:

- Agar op empty hai, to current operator ko directly op mein push karo.

- Agar op empty nahi hai, to op.peek() ki precedence check karo:
  - Agar op.peek() ki precedence current operator ke equal ya higher hai,
    to pehle op.peek() ko perform karo, us operator ko op se pop karo, aur
    phir current operator ko op mein push karo.

  - Agar op.peek() ki precedence current operator se lower hai, to previous
    operator ko perform mat karo; current operator ko directly op mein push
    karo.

Agar character ) hai, to op stack se operators ko tab tak perform karo jab
tak ( na mil jaye. Phir ( ko pop karke remove kar do.
 */