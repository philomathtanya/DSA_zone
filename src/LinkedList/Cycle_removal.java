package LinkedList;

public class Cycle_removal {
    public void create_cycle(Node nn,Node tail)
    {
        tail.next=nn.next;//yaha nn bhi kr ste h agr linking tumhe first node se krni h
    }
    public static Node hascycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return slow;
            }

        }
        return  null;

    }
    public static void removal(Node head)
    {
        Node meetup = hascycle(head);
        if (meetup == null) {
            return;
        }
        Node fast = meetup;
        Node start = head;
        while (start.next != fast.next) {
            start = start.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public static void main(String[] args) {
        Node nn= new Node(1);
        nn.next=new Node(2);
        nn.next.next=new Node(3);
        nn.next.next.next=new Node(4);
        nn.next.next.next.next=new Node(5       );
        Node tail=nn.next.next.next.next;
        Cycle_removal ll=new Cycle_removal();
        ll.create_cycle(nn,tail);
        System.out.println(ll.hascycle(nn).data);
        ll.removal(nn);
        System.out.println(ll.hascycle(nn).data);//output m exception aayega becx we are printing null ka data
    }
}
