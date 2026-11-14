package DSA.Heaps_and_Priority_Queue;
//Heap is implemented by array and visualised as a Complete Binary Tree
//with heap order property
public class Implementation_A_Min_Heap_By_Array {
    public static class Minheap{
        private int []arr;
        private int size;
        Minheap(int capacity){
            arr = new int[capacity];
            size = 0;
        }
        public void add(int num){
            if(size == arr.length){
                System.out.println("Heap is full");
                return;
            }
            arr[size++] = num;
            upheapify(size-1);
        }
        public void upheapify(int idx) {

            // Base case: root reached
            if (idx == 0) return;

            int p = (idx - 1) / 2;

            // Min Heap property satisfied
            if (arr[idx] >= arr[p]) return;

            // Swap
            int temp = arr[idx];
            arr[idx] = arr[p];
            arr[p] = temp;

            // Recursive call
            upheapify(p);
        }

        public int peek(){
            if(size == 0 ){
                System.out.println("Heap is Empty!");
                return -1;
            }
            return arr[0];
        }

        public int size(){
            return size;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Heap is empty !");
                return -1;
            }
            int peek = arr[0];
            //swap
            int temp = arr[size-1];
            arr[size-1] = arr[0];
            arr[0] = temp;

            size--;
            downheapify(0);
            return peek;

        }
        public void downheapify(int idx) {

            int left = 2 * idx + 1;
            int right = 2 * idx + 2;

            int min = idx;// base case;

            // Check left child
            if (left < size && arr[left] < arr[min]) {
                min = left;
            }

            // Check right child
            if (right < size && arr[right] < arr[min]) {
                min = right;
            }

            // Parent is already smallest
            if (min == idx) return;

            // Swap
            int temp = arr[idx];
            arr[idx] = arr[min];
            arr[min] = temp;

            // Recursive call
            downheapify(min);
        }
    }
    static void main(String[] args) {
        Minheap pq = new Minheap(10);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
        pq.add(0);
        System.out.println(pq.peek());
        pq.add(-4);
        System.out.println(pq.peek()+" "+pq.size());
        System.out.println(pq.remove()+" This element is removed");
    }
}
/*
# Min Heap Data Structure - Formulas & Indexing

Jab ek Complete Binary Tree (CBT) ko array ke form me represent kiya jata
hai, toh parent aur child nodes ke beech ka index relation yeh hota hai:

1. Left Child Index (lc)
   - Formula: lc = 2 * p + 1
   - Description: Agar parent node ka index p hai, toh uske left child ka
     index nikalne ke liye parent ke index ko 2 se multiply karke 1 jodna
     padta hai.

2. Right Child Index (rc)
   - Formula: rc = 2 * p + 2
   - Description: Agar parent node ka index p hai, toh uske right child ka
     index nikalne ke liye parent ke index ko 2 se multiply karke 2 jodna
     padta hai.

3. Parent Index (p)
   - Formula: p = (c - 1) / 2
   - Description: Agar aapko kisi child node (c, chahe woh left child ho ya
     right child) ka index pata hai aur uska parent find karna hai, toh child
     ke index me se 1 ghata kar 2 se divide karna hota hai (integer division).
==================================================================================
1-> A sorted array (accending order ) is always a minheap. Vice-versa
    is not true;
2-> A sorted array in decreasing order is always a maxheap.
 */