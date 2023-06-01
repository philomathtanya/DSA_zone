package LinkedList;

public class Linked_list {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            // TODO Auto-generated constructor stub
            this.data = data;
        }

    }

    private Node head;
    private int size;
    private Node tail;

    public void addfirst(int item) {

        Node nn = new Node(item);
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;

        } else {
            nn.next = this.head;
            this.head = nn;
            this.size++;

        }

    }

    public void addlast(int item) {
        if (this.size == 0) {
            addfirst(item);
        } else {
            Node nn = new Node(item);
            this.tail.next = nn;
            this.tail = nn;
            this.size++;
        }

    }
    public void addatindex(int item, int k)  {

        if (k < 0 || k > size) {
            System.out.println("index out of bound");
        }
        if (k == 0) {

            addfirst(item);
        } else if (k == size) {
            addlast(item);
        } else {
            Node nn = new Node(item);
            Node k_1th = GetNode(k - 1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            this.size++;

        }

    }
    private Node GetNode(int k) {
        if (k < 0 || k >= size) {
            System.out.println("index out of bound");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++) {
            temp = temp.next;

        }
        return temp;

    }
    public int getfirst()  {
        if (this.head == null) {
            System.out.println("ll empty");
        }

        return this.head.data;
    }

    public int getlast()  {
        if (this.head == null) {
            System.out.println("ll khali h");
        }

        return this.tail.data;
    }

    public int getatindex(int k)  {

        return GetNode(k).data;

    }
    public int removeFisrt()  {
        if (this.head == null) {
            System.out.println("ll khali h");
        }

        Node temp=head;
        this.head=null;
        this.head=temp.next;
        this.size--;
        return temp.data;
    }
    public int removelast()  {
        if (this.head == null) {
            System.out.println("ll khali h");
        }
        if (this.size == 1) {
            return removeFisrt();
        }

      Node temp=GetNode(this.size-2);
       int rv=tail.data;
       temp.next=null;
       this.tail=temp;
       this.size--;
       return rv;



    }
    public int removeatindex(int k) {
        if (k < 0 || k >= size) {
            System.out.println("index out of bound");
        }

        if (k == 0) {
            return removeFisrt();
        } else if (k == this.size - 1) {
            return removelast();
        } else {
            Node kth = GetNode(k);
            Node k_1th = GetNode(k - 1);
            k_1th.next = kth.next;
            kth.next = null;
            this.size--;
            return kth.data;

        }

    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }


}
