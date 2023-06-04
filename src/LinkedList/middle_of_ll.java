package LinkedList;

public class middle_of_ll {

   public Node middle(Node head) {
       Node fast=head;
       Node slow= head;
       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
    }

    public static void main(String[] args) {
        middle_of_ll ll=new middle_of_ll();
        Node nn=new Node(10);
        nn.next=new Node(20);
        nn.next.next=new Node(30);
        nn.next.next.next=new Node(40);
        nn.next.next.next.next=new Node(50);
        System.out.println( ll.middle(nn).data);



    }


}
