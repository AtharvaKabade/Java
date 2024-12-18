import java.util.LinkedList;

public class akll {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   public static  Node head;
   public static Node tail;
   public static int size;

   // to add at first
   public  void addFirst(int data){
    Node newNode= new Node(data);
    size++;
    if(head == null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
   }

   // to add at last
   public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
   }
   // to add at index 
   public  void add(int idx,int data){
    if(idx==0){
        addFirst(data);
        return;
    }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
   }
    void print(){
    if(head==null){
        System.out.println("LL IS EMPTY");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.println("null");
   }
//Remove First
public int removeFirst(){
    if(size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    else if(size == 1){
        int val = head.data;
        head =tail=null;
        size =0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}
//Remove Last
public int removeLast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size == 1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    //prev : i=size-2
    Node prev=head;
    for (int i = 0; i < size-2; i++) {
        prev=prev.next;
    }
    int val=prev.next.data;  //old tail data
    prev.next=null;
    tail=prev;
    size--;
    return val;
}
//Remove at index
public void  remove(int idx){
    if(idx==0){
        removeFirst();
    }
    if(idx==size-1){
        removeLast();
    }
    //travel to the index
    Node prev=head;
    int i=0;
    while(i<idx-1){
        prev=prev.next;
        i++;
    }

    prev.next=prev.next.next;
}

//LINEAR SEARCH
//Search a key in Linked List
    public int SearchKey(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){ 
                return i;  //Key found
            }
            temp=temp.next;
            i++;
        }
        //Key not found
        return -1;
    }
    //RECURSIVE SEARCH
    public int helper(Node head,int key){
       //base case
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;           //when we found the key we return 0 bcz it is the head node (index=0)of sub linked list
        }                       // later we add while backtracking to get proper index
        int idx=helper(head.next, key);  //recursive call
        if(idx ==-1){   //key not found
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    //REVERSE OF LINKEDLIST
    public void reverse(){
        Node prev=null;  //initially previous node will be null
        Node curr=tail=head;
        Node next;

        while(curr !=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthFromEnd(int n){
        // calculate size
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){ //it will be the head of original list
            head=head.next;
            return;
        }
        //now i eant to reach till previous node
        Node prev=head;
        int i=1;
        int idxToFind=size-n;
        while(i<idxToFind){
            prev=prev.next;
            i++;
        }
        // now i am on previous node
        prev.next=prev.next.next;
        return;
    }

    //TO FIND PALINDROME OR NOT

    //Slow and fast approch
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; // slow=slow+1
            fast=fast.next.next; //fast= fast+2
        }
        return slow; //slow is my middle
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){ //if ll is empty or 1 node then it is palindrome
            return true;
        }
        // step 1 - find mid
        Node midNode= findMid(head);


        //step 2 - reverse second half
        Node prev=null;
        Node curr =midNode;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; //right half head
        Node left=head ;//left half head

        //step 3 - check /compair left and right
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right = right.next;
        }
        return true;
    }

    // CHECK LL IS CYCLIC/LOOP OR NOT
    public static boolean isCyclic(){
        Node slow=head;
        Node fast=head;

        while(fast !=null && fast.next!= null){
            slow =slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true;    // cycle exist
            }
        }
        return false;  //cycle doesnot exist
    } 

    //remove cycle/loop
    
    public static void removeCycle(){
        // detect cycle
        Node fast = head;
        Node slow = head;
        boolean cycle =false; //to track does cycle exist

        while(fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev =null;   // after this loop will be completed this prev node will be our last node of ll
        while(slow != fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;
        
    }


    //merge sort 
    //find mid
    private Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //this will be my mid of LL
    }
    //merge step
    private Node merge(Node lefthead, Node righthead){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(lefthead!= null && righthead!= null){
            if(lefthead.data<=righthead.data){
                temp.next=lefthead;
                lefthead = lefthead.next;
                temp=temp.next;
            }
            else{
                temp.next=righthead;
                righthead=righthead.next;
                temp = temp.next;
            }
        }
        while(lefthead!=null){
            temp.next=lefthead;
            lefthead = lefthead.next;
            temp=temp.next;
        }
        while(righthead!=null){
            temp.next=righthead;
            righthead=righthead.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){           // TC=O(n logn )
        if(head== null  || head.next == null){
            return head;
        }
        //fnd mid
        Node mid=findmid(head);

        //left & right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }
    public void zigzag(){
        //find mid 
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        //Reverse 2nd half
         Node curr =mid.next;
         mid.next = null;
         Node prev= null;
         Node next;
         while( curr != null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
             }

             Node lefthead=head;
             Node righthead=prev;
            Node nextL , nextR;

            // zig-zag merge
            while(lefthead != null && righthead !=null){
                nextL  = lefthead.next;
                lefthead.next=righthead;
                nextR=righthead.next;
                righthead.next=nextL;

                lefthead=nextL;
                righthead=nextR;
            }
        
         

    }

    public static void main(String[] args) {
        akll ak=new akll();
       // ak.print();
    //     ak.addFirst(2);
    //     //ak.print();
    //     ak.addFirst(1);
    //     //ak.print();
    //     ak.addLast(3);
    //    // ak.print();
    //     ak.add(3,4);
    //    // ak.print();
    //    // ak.removeFirst();
    //     ak.addLast(5);
    //     //ak.print();
    //     //ak.removeLast();
    //     //System.out.println(ak.recursiveSearch(10));
    //     ak.print();
    //    // ak.reverse();
    //     //ak.print();
    //     ak.deleteNthFromEnd(3);
    //     ak.print();
        //System.out.println(ak.SearchKey(3)); 
       // System.out.println(size);
       ak.addLast(1);
       ak.addLast(2);
       ak.addLast(2);
       ak.addLast(1);
       ak.print();
       ak.remove(2);
       ak.print();
    //    System.out.println(ak.checkPalindrome());
    // head=new Node(1);
    // head.next = new Node(2);
    // head.next.next= new Node(3);
    // head.next.next.next=head.next;
    // //1->2->3->1
    // System.out.println(isCyclic());
    // removeCycle();
    // System.out.println(isCyclic());
//     ak.addLast(1);
//     ak.addLast(2);
//     ak.addLast(3);
//     ak.addLast(4);
//     ak.addLast(5);
//     //1->2->3->4->5
//     ak.print();
//    //ak.head= ak.mergeSort(ak.head);
//     ak.zigzag();
//    ak.print();
  }
}
