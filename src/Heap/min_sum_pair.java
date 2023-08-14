package Heap;

import java.util.PriorityQueue;

public class min_sum_pair {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,1,9};
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            sum=a+b;
            pq.add(sum);
        }
        System.out.println(sum);
    }
}
