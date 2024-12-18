import java.util.*;
public class mergeLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  Node merge(Node left,Node right){
        Node mergedll= new Node(-1);
        Node temp=mergedll;

        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }

        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return mergedll.next;
}
    public  Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node midNode=findMid(head);
        Node rightHead=midNode.next;
        midNode.next=null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left,right);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(10);
        ll.addFirst(15);
        ll.addFirst(6);
        ll.addFirst(12);
        ll.addLast(2);
        System.out.println(ll);
        mergeSort(ll);
        System.out.println(ll);
    }
}
