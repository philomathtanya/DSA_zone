package Stack;

import java.util.Stack;
//good question

public class Maximum_sum_of_good_subarray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,1,5};
        int k=2;
        System.out.println(area(arr,k));
    }

    public static int area(int[] arr,int k) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int r = i;
                int h = arr[st.pop()];
                if (r - 1 >= k) {
                    if (st.isEmpty()) {
                        ans = Math.max(ans, h * r);
                    } else {
                        int l = st.peek();
                        if (l + 1 <= k) {
                            ans = Math.max(ans, h * (r - l - 1));
                        }
                    }
                }

            }
            st.push(i);
        }
        int r= arr.length;
        while(!st.isEmpty())
        {
            int h = arr[st.pop()];
            if (r -1 >= k) {
                if (st.isEmpty()) {
                    ans = Math.max(ans, h * r);
                } else {
                    int l = st.peek();
                    if (l + 1 <= k) {
                        ans = Math.max(ans, h * (r - l - 1));
                    }
                }
            }
        }
        return ans;
    }
}
