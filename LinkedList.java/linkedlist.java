import java.util.LinkedList;

public class linkedlist {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;   // head node
    public static Node tail;    //tail node

    public static void addFirst(int data){
        Node Newnode=new Node(data);
        if(head==null){
            head = tail =Newnode;
            return;
        }
        Newnode.next=head;
        head=Newnode;
    }
    public static void addLast(int data){
        Node Newnode=new Node(data);
        if(head==null){
            head=tail=Newnode;
            return;
        }
        tail.next=Newnode;
        tail=Newnode;
    }
    public static void print(){ //T.C=O(N);
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void reverse(){
        Node prev=null;
        Node curr=head=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        linkedlist ab= new linkedlist();
        ab.print();
        ab.addFirst(2);
        ab.addFirst(1);
        ab.addLast(3);
        ab.addLast(4);
        ab.print();
        ab.reverse();
        ab.print();
    }
}
