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

     class NodeTag{
     treeNode Node;
        int tag ;

    NodeTag(int t ,int r){
    this.Node = Node;
    this.tag = t;
}

  }

//   public void inOrderST() {
//             inOrderSTACK(root, 0);
//         }

//         private void inOrderSTACK(treeNode root, int tag) {
//             Stack<NodeTag> st = new Stack<>();
//             if (root == null)
//                 return;

//             st.push(new NodeTag(root, 0)); 

//             while (!st.isEmpty()) {
//                 NodeTag temp = st.pop();

//                 if (temp.left != null && tag == 0) {
//                     st.push(new NodeTag(temp.Node, temp.tag + 1));
//                     st.push(new NodeTag(temp.Node.left, 0));

//                 }

//                 else {
//                     System.out.println(temp.Node.data + " ");
//                     if (temp.Node.right != null)
//                         st.push(new NodeTag(root.Node.right, 0));
//                 }
//             }

//         }

        public int sum(){
           return TreeSum(root);
        }

        public int TreeSum(treeNode root){
            if(root==null) return 0;

            int left = TreeSum(root.left);
            int right = TreeSum(root.right);

            return left + right + root.data;
        }


    public boolean findelement(int ele) {
        return findNode(root, ele);
    }

    public boolean findNode(treeNode root, int d) {
        // boolean res = false,res2=false;
        // if (root.data == d) {
        //     System.out.println("Yes,it is exist in tree - ");
        //     return true;
        // }
     
        // if (root.left != null)
        //     res = findNode(root.left, d);
        // if (root.right != null)
        //     res2 = findNode(root.right, d);
        
        // return res || res2;

        boolean res = false;

        if(root.data==d){
            System.out.println("yes, it is exist in tree - ");
            return true;
        }

        if(root.data<=d && root.right!=null){
            res = findNode(root.right, d);
        }
        if(root.data>d && root.left!=null){
            res = findNode(root.left, d);
        }
        return res;

    }

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
        bt.printnode();
        System.out.println(bt.findelement(37));

        System.out.println("treesum is - "+bt.sum());

    }
}
