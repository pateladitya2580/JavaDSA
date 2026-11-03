package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.PriorityQueue;

// Find kth largest element ,LeetCode 215
public class Question2 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> p = new PriorityQueue<>();//min priority queue
            for(int ele : nums){
                p.add(ele);
                if(p.size()>k) p.remove();
            }
            return p.peek();
        }
    }
    static void main(String[] args) {

    }
}
