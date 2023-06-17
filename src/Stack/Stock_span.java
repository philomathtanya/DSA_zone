package Stack;

import java.util.Stack;
// good question
public class Stock_span {
    public static void main(String[] args) {
        int arr[]={91,11,13,15,42,37};
        stock(arr);
    }
    public static void stock(int []arr)
    {
        int ans[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while( !st.isEmpty() && arr[i]>arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                arr[i]=i+1;
            }
            else{
arr[i]=i=st.peek();
            }
            st.push(i);
        }

    }
}
