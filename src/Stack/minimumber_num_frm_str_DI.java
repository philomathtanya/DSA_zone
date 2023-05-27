package Stack;

import java.util.Stack;

public class minimumber_num_frm_str_DI {
    public static void main(String[] args) {
        String str="DDDIIIDD";
        find(str);
    }
    public static void find(String str)
    {
        Stack<Integer>st=new Stack<>();
        int arr[]=new int[str.length()+1];
        int c=1;
        for(int i=0;i<=str.length();i++)
    {
           if(i==str.length() || str.charAt(i)=='I')
           {
               arr[i]=c;
               c++;
               while(!st.isEmpty())
               {
                   arr[st.pop()]=c;
                   c++;
               }

           }
           else
           st.push(i);
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
