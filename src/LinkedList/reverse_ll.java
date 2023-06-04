package LinkedList;

public class reverse_ll {
    public static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;

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
        Node nn= new Node(10);
        nn.next=new Node(20);
        nn.next.next=new Node(30);
        nn.next.next.next=new Node(40);
        reverse_ll ll=new reverse_ll();
       Node k= ll.reverse(nn);
       ll.display(k);
    }

}
