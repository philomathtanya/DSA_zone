package Stack;

import java.util.Stack;

public class Maximal_rect {
    public static void main(String[] args) {
        int [][]matrix={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1,1},{1,0,0,1,0}};
        int arr [][]=new int[matrix.length][matrix[0].length];
        int ans=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==arr.length-1)
                {
                    arr[i][j]=matrix[i][j];

                }
                else {
                    arr[i][j]= matrix[i][j]==1?arr[i+1][j]+1:0;
                }
            }
            ans=Math.max(ans,Area(arr[i]));
        }
        System.out.println(ans);
    }

    public static int Area(int[] arr) {

        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int r = i;
                int h = arr[st.pop()];
                if (st.isEmpty()) {
                    maxArea = Math.max(maxArea, (r * h));
                } else {
                    int l = st.peek();
                    maxArea = Math.max(maxArea, ((r - l - 1) * h));
                }

            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.isEmpty()) {

            int h = arr[st.pop()];
            if (st.isEmpty()) {
                maxArea = Math.max(maxArea, (r * h));
            } else {
                int l = st.peek();
                maxArea = Math.max(maxArea, ((r - l - 1) * h));
            }

        }
        return maxArea;

    }
}
