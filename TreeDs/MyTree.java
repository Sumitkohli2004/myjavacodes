package TreeDs;

import java.util.*;

class treeNode {
    int data;
    treeNode left;
    treeNode right;

    treeNode(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    treeNode root;

    Tree() {
        this.root = null;
    }

    public void insert(int d) {
        root = insertNode(root, d);
    }

    public treeNode insertNode(treeNode R, int d) {
        treeNode newNode = new treeNode(d);
        if (R == null) {
            R = newNode;
            return R;
        }
        if (d < R.data) {
            R.left = insertNode(R.left, d);
        } else
            R.right = insertNode(R.right, d);
        return R;

    }

    public void printnode() {
        if (root == null) {
            System.out.println("root is empty - ");
            return;
        }
        Queue<treeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            treeNode node = q.poll();
            System.out.print(node.data + " ");

            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }

        }
    }
    public boolean findelement(int ele){
        return findNode(root,ele);
    }

    public boolean findNode(treeNode root , int d){
        boolean res = false;
        if(root.data== d ){
            System.out.println("yes it is exist in tree - ");
            return true;
        }
        else{
            if(root.left!=null)
            res = findNode(root.left,d);
            if(root.right!=null)
            res = findNode(root.right,d);

        }
        return res;
        
     }

}

public class MyTree {
    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.insert(10);
        bt.insert(5);
        bt.insert(15);
        bt.insert(20);
        bt.insert(25);
        bt.insert(37);
        bt.printnode();
        System.out.println(bt.findelement(15));
        
        

        
    }
}
