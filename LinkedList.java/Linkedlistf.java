import java.util.*;
public class Linkedlistf {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public static Node head;
public static Node tail;

public void addFirst(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next = head;
    head=newNode;
}
public void addLast(int data){
    Node newNode = new Node(data);
    if(head== null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}
public void print(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp =head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        Linkedlistf ab = new Linkedlistf();
        ab.addFirst(2);
        ab.addFirst(1);
        ab.addLast(3);
        ab.addLast(4);
        ab.print();
    }
}
