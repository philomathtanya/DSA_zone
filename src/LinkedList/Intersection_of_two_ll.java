package LinkedList;

public class Intersection_of_two_ll {
    public Node intersect(Node head1,Node head2)
    {
        Node a=head1;
        Node b=head2;
        while(a!=b)
        {
            if(a==null)
            {
                a=head2;
            }
            else {
                a=a.next;
            }
            if(b==null)
            {
                b=head1;
            }
            else {
                b=b.next;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Intersection_of_two_ll ll=new Intersection_of_two_ll();
        Node nn = new Node(10);
        Node nn1 = new Node(3);

        Node newNode = new Node(6);
        nn1.next = newNode;

        newNode = new Node(9);
        nn1.next.next = newNode;

        newNode = new Node(15);
        nn.next = newNode;
       nn1.next.next.next = newNode;

        newNode = new Node(30);
       nn.next.next = newNode;

        nn.next.next.next = null;


        System.out.println(ll.intersect(nn,nn1).data);
    }
}
