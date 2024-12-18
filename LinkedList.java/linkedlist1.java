import java.util.*;
public class linkedlist1 {
    public static class Node {
        int data;
        Node next;

         Node(int data){
        this.data=data;
        this.next=next;
    }
    }
   
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public static void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        int i=0;
        Node temp=head;
        
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    //INSRT USING RECURSION 
    public void insertRecu(int data,int idx){
        head=insertRec(val, idx, head);
    }
    private Node insertRec(int data,int idx,Node node){
        if(idx==0){
            Node temp=new Node(val,node); //creating a new node
            size++;
            return temp;
        }
        node.next=insertRec(data, idx--, node.next);
        return node;
    }
    public static void print(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");    
    }
    public void  reverse(){
        System.out.println();
            Node prev=null;
            Node curr= tail =head;
            Node next;
            while(curr != null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
    }
    //delente nth node from last
    // nth node from last = (size-n +1)
    // public void delNthFromLast(int n){
    //     System.out.println();
    //     int sz=0;
    //     Node temp=head;
    //     while(temp != null){
    //         temp=temp.next;
    //         sz++;
    //     }
    //     //corner case
    //     if(n==sz){
    //         head=head.next;
    //         return;
    //     }
    //     // now i have to reach previous of Nth node
       
    //     int i=1;
    //      int iToFind=sz-n;
    //     Node prev = head;
    //     while(i < iToFind){
    //         prev=prev.next;
    //         i++;
    //     }
    //     //i trached previous node
    //     prev.next=prev.next.next;
    //     return;
    // }

    public static void main(String[] args) {
        linkedlist1 ll = new linkedlist1();
        ll.addfirst(1);
        ll.addfirst(0);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.add(2, 9);
        // ll.print();
       System.out.println("\n"+ll.size);
       //ll.reverse();
    //    ll.delNthFromLast(3);
    //    ll.print();
    }
}

