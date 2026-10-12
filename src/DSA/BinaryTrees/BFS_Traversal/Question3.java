package DSA.BinaryTrees.BFS_Traversal;

import java.util.LinkedList;
import java.util.Queue;

// tree ko print karo level wise using q;
public class Question3 {
    public static class pair{
        Node node;
        int level;
        pair(Node node,int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrder(Node root){// Breadth first search(BFS)
        int prevlevel = 0;
        Queue<pair> q = new LinkedList<>();
        if(root!= null) q.add(new pair(root,0));
        while (q.size()>0){
            pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!= prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new pair(temp.left,lvl+1));
            if(temp.right!= null) q.add(new pair(temp.right,lvl+1));
        }
        System.out.println();
    }
    static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        levelOrder(a);
    }
}
/*leetcode 102 second approach
class Solution {
    public int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    public  class pair{
        TreeNode node;
        int level;
        pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }
    }

     public  void BFS(TreeNode root,List<List<Integer>> ans){// Breadth first search(BFS)
        Queue<pair> q = new LinkedList<>();
        if(root!= null) q.add(new pair(root,0));
        while (q.size()>0){
            pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;

            ans.get(lvl).add(temp.val);
            if(temp.left!=null) q.add(new pair(temp.left,lvl+1));
            if(temp.right!= null) q.add(new pair(temp.right,lvl+1));
        }
        System.out.println();
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i = 1;i<= lvl;i++){
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        BFS(root,ans);
        return ans;
    }
}
 */