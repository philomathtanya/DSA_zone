package LinkedList;

public class create_nd_has_cycle {
public void create_cycle(Node nn,Node tail)
{
        tail.next=nn.next;//yaha nn bhi kr ste h agr linking tumhe first node se krni h
}
public boolean hascycle(Node head)
{
    Node slow=head;
    Node fast=head;
   while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            return true;
        }

    }
   return  false;

}
    public static void main(String[] args) {
        create_nd_has_cycle ll=new create_nd_has_cycle();
       Node nn= new Node(10);
        nn.next=new Node(20);
        nn.next.next=new Node(30);
        nn.next.next.next=new Node(40);
        nn.next.next.next.next=new Node(50);
        Node tail=nn.next.next.next.next;
        ll.create_cycle(nn,tail);
        System.out.println( ll.hascycle(nn));
    }
}
