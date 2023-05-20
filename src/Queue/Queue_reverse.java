package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_reverse {
    public static void main(String[] args) {
        Queue<Integer>que=new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        reverse(que);
        System.out.println(que);
    }
    public static void reverse(Queue<Integer>que)
    {
        if(que.isEmpty())
        {
            return;
        }
        int x=que.poll();
        reverse(que);
        que.add(x);
    }
}
