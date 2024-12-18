public class doubly {
    public class Node{
        int data;
        Node next;
        Node prev;

      public  Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
       } 
    }
    public static Node head;
    public static Node tail;
    public static int size ;

    //add first
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null ){
            head = tail = newNode;
            return; 
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //ADD LAST
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
       // newNode.next=null;
        newNode.prev=temp;
        
    } 
    //remove first
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL IS EMPTY");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val; 
        }
        int val=head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    // REMOVE LAST
    public void removelast(){
        if(head == null){
            System.out.println("DLL is empty");
            return;
        }
        Node temp =head;
        if(size == 1){
        head=tail=null;
        size--;
        return;
        }
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next=null;
        // Node back=temp.prev;
        // back.next=null;
        // temp.prev=null;
       // temp.prev.next=null;
       size--;
        return;
    }
    //REVERSE DLL
    public void reverse(){
        Node curr=head;
        Node prev = null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // print
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doubly db = new doubly();
        db.addfirst(4);
        db.addfirst(3);
        db.addfirst(2);
        db.addfirst(1);
        db.addlast(5);
       // db.addlast(5);
        db.print();
       // db.removelast();
       // db.reverse();
       // db.print();
       // System.out.println(db.size);
        //  db.removeFirst();
         db.removelast();
         db.print();
        // System.out.println(db.size);

    }
}
