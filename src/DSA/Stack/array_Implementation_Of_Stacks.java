package DSA.Stack;

public class array_Implementation_Of_Stacks {
    public static class Stack{
        int []arr =  new int[5];
        int idx = 0;// very very importent;

        void push(int val){
            if(isfull()){
                System.out.println("Stack is full !!");
                return;
            }
            arr[idx] = val;
            idx++;
        }

        int peek(){
            if(idx == 0) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty !!");
                return -1;
            }
            int ans = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return ans;
        }

        void display(){
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        boolean isfull(){
            if(idx == arr.length) return true;
            else return false;
        }
    }
    static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
        System.out.println("Peak is "+st.peek());
        st.pop();
        st.display();
        System.out.println("Size is "+st.size());
        System.out.println(st.isfull());
        System.out.println(st.isEmpty());
    }
}
