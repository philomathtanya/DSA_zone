package LinkedList;

public class sort_list {
    public static Node sort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node mid=middleofll(head);
        Node headb=mid.next;
        mid.next=null;
        Node A=sort(head);
        Node B=sort(headb);

        return merge(A,B);

    }
    public static  Node merge(Node list1,Node list2)
    {
        Node dummy=new Node();
        Node temp=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.data<list2.data)
            {
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else {
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null)
        {
            temp.next=list1;
        }
        if(list2!=null)
        {
            temp.next=list2;
        }
        return dummy.next;
    }
    public static Node middleofll(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null )
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        sort_list ll =new sort_list();
        Node nn= new Node(10);
        nn.next=new Node(2);
        nn.next.next=new Node(0);
        nn.next.next.next=new Node(8);
        nn.next.next.next.next=new Node(50);
        Node k=ll.sort(nn);
        ll.display(k);

    }
}
