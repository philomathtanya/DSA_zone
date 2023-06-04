package LinkedList;

public class merge_two_sorted_ll {
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
        Node nn= new Node(1);
        nn.next=new Node(4);
        nn.next.next=new Node(7);
        Node nn1= new Node(2);
        nn1.next=new Node(7);
        nn1.next.next=new Node(8);

        merge_two_sorted_ll ll=new merge_two_sorted_ll();
        Node headnew=ll.merge(nn,nn1);
        display(headnew);
    }
}
