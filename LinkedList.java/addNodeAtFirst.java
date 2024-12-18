import java.util.*;

public class addNodeAtFirst {
    
    public static class Node{ // create a class for creation a NODE
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;   // head node
    public static Node tail;    //tail node

    

    public void addFirst(int data){                 //TC=O(n)
        //step 1 creating a node
        Node newnode= new Node(data);
        if(head==null){     //if linklist is empty
            head=tail=newnode;
            return;
        }
        //step 2 newnode next= head
        newnode.next=head;  //link
        //step 3 head=newnode
        head=newnode;
    }
    public void addLast(int data){
        //step 1 to create node
        Node newnode=new Node(data);
        if(head==null){         //if linked list is null
            head=tail=newnode;
            return;
        }
        //step 2 tail.next=newnode
        tail.next=newnode;
        //step 3  our new tali
        tail=newnode; 
    }
    // print linkedlist
    public static void print(){
        if(head==null){
            System.out.println("LL is empty ");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
       System.out.println();
    }
   

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        //ll.print();
       ll.addFirst(1);
        //ll.print();
        ll.addFirst(2);
        //ll.print();
        ll.addLast(3);
        //ll.print();
        ll.addLast(4);
        print();
        // the linked list  is 2 -> 1 -> 3 -> 4
    }
}
