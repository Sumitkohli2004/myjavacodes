import java.util.Stack;
import java.util.*;

public class stock_span_method {

    public static int[] ind(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int span = 1;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                span += st.peek();
                st.pop();
            }
            if (st.isEmpty()) {
                st.push(i + 1);
            } else
                st.push(i - st.peek());

            st.push(i);

        }
        return ind(arr);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 80, 70, 75, 120, 80, 90 };
        int res[] = ind(arr);

    }
}
