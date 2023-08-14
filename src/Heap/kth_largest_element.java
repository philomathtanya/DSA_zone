package Heap;

import java.util.PriorityQueue;

public class kth_largest_element {
    public static void main(String[] args) {
        int arr[]={1,2,5,8,95,95,3,79,3,87,43};
        int k=3;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i< arr.length;i++)
        {
            if(pq.peek()<arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());

    }
}

