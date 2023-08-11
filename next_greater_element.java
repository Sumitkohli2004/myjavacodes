import java.util.Stack;

public class next_greater_element {
   public static void main(String[] args) {
      int arr[] = {1,3,5,2,7,1,9,4,8};
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        res[n-1] = -1;
        st.push(arr[n-1]);

        for(int i = arr[n-2]; i>=0;i--){
            while(st.peek()<arr[i] && !st.isEmpty()){
                st.pop();
                st.push(arr[i]);
            }
             if (st.size() == 0) res[i] = -1;

            else res[i] = st.peek();

            st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();

        for(int j=0;j<arr.length;j++)
        System.out.print(res[j]+" ");
       
}
 }
