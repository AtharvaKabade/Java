import java.util.LinkedList;

public class first {
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
    Node newNode =new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode=tail.next;
    tail=newNode;

}
    public static void show(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
        }
        
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        first ll=new first(); // creating an object
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.show();
    }
}
