package DSA.HashMaps_and_HashSets;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//HackerRank , Top view of binary tree
//Given a pointer to the root of a binary tree, print the top view of the binary tree.
//The tree as seen from the top the nodes, is called the top view of the tree.
public class Question5 {
    public class Node {
        int data;
        Node left;
        Node right;
    }
    public static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void topView(Node root ){
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;
        while(q.size()>0){
            Pair temp = q.remove();
            Node n = temp.node;
            int lvl = temp.level;
            minLevel = Math.min(minLevel,lvl);
            maxLevel = Math.max(maxLevel,lvl);
            if(!map.containsKey(lvl)) {
                map.put(lvl,n.data);
            }
            if(n.left != null) q.add(new Pair(n.left,lvl-1));
            if(n.right != null) q.add(new Pair(n.right, lvl+1));
        }
        for (int i = minLevel; i <= maxLevel; i++) {
            System.out.print(map.get(i)+" ");
        }
    }
    static void main(String[] args) {

    }
}
