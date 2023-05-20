package Stack;

import java.util.Stack;

public class Stack_reverse {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack <Integer>st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int x=st.pop();
        reverse(st);
        insertbottom(st,x);
    }
    public static void insertbottom(Stack<Integer>st,int x)
    {
if(st.isEmpty())
{
    st.push(x);
    return;
}
int y=st.pop();
insertbottom(st,x);
st.push(y);



    }
}
