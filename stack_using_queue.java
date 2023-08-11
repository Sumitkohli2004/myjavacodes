

import java.util.Stack;

class queueusingstack {
     Node top = null;
    stack st1 = new stack();
    stack st2 = new stack();

    public void enqueue(int element) {
        st1.push(element);
    }

    public int dequeue() {
        int res = -1;
        if (st2.isEmpty()) {
           while(!st1.isEmpty()){
            st2.push(st1.pop());
           }
        }
        res = st2.peek();
        st2.pop();
        return res;

    }

    public int straight(){
        int res = st1.peek();
        while(!st1.isEmpty()){
          st2.push(st1.pop());
        }
        return res;
    }

    public void print() {
       System.out.println("stack 1..."); st1.print();
       System.out.println("stack 2..."); st2.print();

    }

}

public class stack_using_queue {
    public static void main(String[] args) {
        queueusingstack q = new queueusingstack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);
        q.print();
        q.straight();
        q.print();


    }
}
