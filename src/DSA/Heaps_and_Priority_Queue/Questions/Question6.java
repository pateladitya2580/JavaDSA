package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.HashMap;
import java.util.PriorityQueue;

//LeetCode 347 Top K Frequent Elements
public class Question6 {
    class Solution {
        public class Pair implements Comparable<Pair>{
            int ele;
            int freq;
            Pair(int ele,int freq){
                this.ele = ele;
                this.freq = freq;
            }
            public int compareTo(Pair p){
                return this.freq - p.freq;
            }
        }
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele : nums){
                int key = ele;
                if(map.containsKey(key)){
                    int freq = map.get(key);
                    map.put(key,freq+1);
                }
                else{
                    map.put(key,1);
                }
            }
            PriorityQueue<Pair> p = new PriorityQueue<>();//min heap
            for( int ele: map.keySet()){
                int freq = map.get(ele);
                p.add(new Pair(ele,freq));
                if(p.size()>k) p.remove();
            }
            int []ans = new int[k];
            int i = 0;
            while (p.size()>0){
                Pair temp = p.remove();
                ans[i] = temp.ele;
                i++;
            }
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
