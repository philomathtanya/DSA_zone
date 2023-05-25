package Stack;

import java.util.Stack;

public class number_ofvalid_subarray {
    public static void main(String[] args) {
//        int arr[]={3,2,11,1,5,7};
        int arr[]={1,4,2,5,3};

        System.out.println(valid(arr));
    }
    public static int valid(int []arr)
    {
        Stack<Integer>st=new Stack<>();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty()&& arr[i]<arr[st.peek()])
            {
                int ii=st.pop();
                c+=i-ii;

            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            int ii=st.pop();
            c+=arr.length-ii;
        }
return c;
    }
}
