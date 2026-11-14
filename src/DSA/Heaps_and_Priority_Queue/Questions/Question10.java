package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

//LeetCode 295. Find Median from Data Stream
public class Question10 {
    class MedianFinder {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        public MedianFinder() {

        }

        public void addNum(int num) {
            if(maxHeap.size()==0) maxHeap.add(num);
            else{
                if(num<maxHeap.peek()) maxHeap.add(num);
                else minHeap.add(num);
            }
            //Balance the heaps
            if(maxHeap.size()>minHeap.size()+1){
                int top = maxHeap.remove();
                minHeap.add(top);
            }
            if(minHeap.size()== maxHeap.size()+ 1){
                int top = minHeap.remove();
                maxHeap.add(top);
            }
        }

        public double findMedian() {
            if(maxHeap.size()==minHeap.size()){
                return (maxHeap.peek()+minHeap.peek())/2.0;
            }
            else if (maxHeap.size()>minHeap.size()) {
                return maxHeap.peek();
            }
            else return minHeap.peek();
        }
    }
    static void main(String[] args) {

    }
}
