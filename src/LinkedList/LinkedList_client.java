package LinkedList;

public class LinkedList_client {
    public static void main(String[] args) {


        Linked_list ll = new Linked_list();
        ll.addfirst(10);
        ll.addlast(20);
        ll.display();
        ll.addatindex(30,2);
        ll.display();
        ll.removeFisrt();
        ll.display();
        System.out.println( ll.removelast());
        ll.display();

//        System.out.println( ll.getfirst());
//        System.out.println(ll.getlast());
//        System.out.println(ll.getatindex(2));

    }
}