import java.util.*;
public class lonely {
    public static void findlonely(ArrayList<Integer>list){
        ArrayList<Integer>newlist=new ArrayList<>();
        for (int i = 0; i <list.size()-1; i++) {
            int a=list.get(i);
            if(list.get(i+1)!=a+1 && list.get(i+1)!=a-1 && list.get(i-1)!=a+1 && list.get(i-1)!=a-1){
                newlist.add(a);
            }
            else{
                continue;
            }
        }
        System.out.print(newlist+" ");
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.print(list+" ");
        System.out.println();
        findlonely(list);
    }
}
