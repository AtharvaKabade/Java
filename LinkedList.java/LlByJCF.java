import java.util.LinkedList;
public class LlByJCF {
    public static void main(String[] args) {
        //create  -> we use class data types(Integer,Float etc)
        LinkedList<Integer>ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // print 
        System.out.println(ll);
        //remove
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
