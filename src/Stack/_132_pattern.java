package Stack;

import java.util.Stack;

public class _132_pattern {
    public static void main(String[] args) {
        int arr[]={3,1,4,2};
        System.out.println(pattern(arr));
    }
    public static boolean pattern (int []arr)
    {
        Stack<Integer>st=new Stack<>();
        int []min=new int [arr.length];
        min[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            min[i]=Math.min(arr[i],min[i-1]);
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            int ith=min[i];
            if(ith<arr[i])
            {
                while(!st.isEmpty() && arr[st.peek()]<=ith)
                {
                    st.pop();
                }
                if(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    return true;
                }
            }
            st.push(i);

        }
        return false;
    }
}
