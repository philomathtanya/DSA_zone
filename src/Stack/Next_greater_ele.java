package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Next_greater_ele {
    public static void main(String[] args) {

        int arr[]={11,2,3,23,13,9,15};
        nge(arr);


    }
    public static void nge(int []arr)
    {
        int []ans=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty()&& arr[i]>arr[st.peek()])
            {
                int ii=st.pop();
                ans[ii]=arr[i];

            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            int ii=st.pop();
            ans[ii]=-1;
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(arr[i]+" "+ans[i]);
        }
    }
}