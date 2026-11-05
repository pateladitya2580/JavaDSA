package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

// LeetCode 1046. Last Stone Weight
public class Question7 {
    class Solution {
        public int lastStoneWeight(int[] stones) {
            // Max Heap
            PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele: stones){
                p.add(ele);
            }
            while (p.size()>1){
                int y = p.remove();
                int x = p.remove();
                if(y!=x ) p.add(y-x);
            }
            if(p.size() == 0) return 0;
            else return p.remove();

        }
    }
    static void main(String[] args) {

    }
}
