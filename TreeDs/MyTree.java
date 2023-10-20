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
    private treeNode root;

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

    class NodeTag {
        treeNode Node;
        int level;

        NodeTag(treeNode n, int l) {
            this.Node = n;
            this.level = l;
        }

    }

    public void traverse(){
        inOrderSTACK(root);
    }

    private void inOrderSTACK(treeNode Node) {
        Queue<NodeTag> q = new LinkedList<>();
        if (root != null)
            q.add(new NodeTag(Node, 0));
        
        int track = 0;

        while (!q.isEmpty()) {
            NodeTag temp = q.poll();
    if(temp.Node.left != null) q.add(new NodeTag(temp.Node.left, temp.level + 1));
    if(temp.Node.right!=null) q.add(new NodeTag(temp.Node.right, temp.level + 1));
        
            if (track != temp.level) {
                System.out.println();
                track = temp.level;
            }
            System.out.print(temp.Node.data+"  ");
        }
    }

    public int sum() {
        return TreeSum(root);
    }

    public int TreeSum(treeNode root) {
        if (root == null)
            return 0;

        int left = TreeSum(root.left);
        int right = TreeSum(root.right);

        return left + right + root.data;
    }

    // public boolean findelement(int ele) {
    //     return findNode(root, ele);
    // }

    // public boolean findNode(treeNode root, int d) {
    //     boolean res = false,res2=false;
    //     if (root.data == d) {
    //     System.out.println("Yes,it is exist in tree - ");
    //     return true;
    //     }

    //     if (root.left != null)
    //     res = findNode(root.left, d);
    //     if (root.right != null)
    //     res2 = findNode(root.right, d);

    //     return res || res2;

    //     boolean res = false;

    //     if (root.data == d) {
    //         System.out.println("yes, it is exist in tree - ");
    //         return true;
    //     }

    //     if (root.data <= d && root.right != null) {
    //         res = findNode(root.right, d);
    //     }
    //     if (root.data > d && root.left != null) {
    //         res = findNode(root.left, d);
    //     }
    //     return res;

    // }

}

public class MyTree {
    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.insert(10);
        bt.insert(5);
        bt.insert(1);
        bt.insert(7);
        bt.insert(15);
        bt.insert(20);
        bt.insert(25);
        bt.insert(37);
        // bt.printnode();
        
        bt.traverse();
        System.out.println(" \nsum is - "+bt.sum());

        // System.out.println(bt.findelement(37));

        // System.out.println("treesum is - " + bt.sum());

    }
}
