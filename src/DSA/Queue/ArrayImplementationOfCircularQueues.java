package DSA.Queue;

public class ArrayImplementationOfCircularQueues {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int []arr = new int[5];

        void add(int val){
            if(size == arr.length){
                System.out.println("Cqueue is full");
                return;
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){
                arr[rear+1] = val;
                rear++;
            }
            else if ( rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        int remove(){
            if(size==0){
                System.out.println("Cqueue is empty!!");
                return -1;
            }
            else if( front < arr.length-1){
                int ans = arr[front];
                front++;
                size--;
                return ans;
            }
            else {//(front == arr.length-1)
                int ans = arr[front];
                front = 0;
                size--;
                return ans;
            }
        }

        public int peek(){
            if (size == 0) {
                System.out.println("Cqueue is empty !!");
                return -1;
            }
            else return arr[front];
        }

        public boolean isEmpty(){
            if(size == 0 ) return true;
            else return false;
        }

        void display(){
            if(size == 0 ){
                System.out.println("Cqueue is empty !!");
                return;
            }
            else{
                if(front <= rear){
                    for(int i = front;i<= rear;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
                else{// rear < front
                    for(int i = front;i<=arr.length-1;i++){
                        System.out.print(arr[i]+" ");
                    }
                    for(int i = 0;i<= rear;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);//1 2 3 4
        q.display();// 1 2 3 4
        q.remove();//2 3 4
        q.add(5);
        q.display();//2 3 4 5
        q.add(6);
        q.display();// 6 2 3 4 4 -> 2 3 4 5 6
        q.add(7);

    }
}
