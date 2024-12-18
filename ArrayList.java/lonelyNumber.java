import java.util.ArrayList;

public class lonelyNumber {
    public static ArrayList<Integer> isLonely(ArrayList<Integer> list){
        ArrayList<Integer> lonly= new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)+1<list.get(i) && list.get(i)< list.get(i+1)+1){
                lonly.add(list.get(i));
            }
        }
        if(list.size()==1){
            lonly.add(list.get(0));
        }

        if(list.size()>1){
            if(list.get(0)+1 < list.get(1)){
                lonly.add(list.get(0));
            }
            if(list.get(list.size()-2)+1 < list.get(list.size()-1)){
                lonly.add(list.get(list.size()-1));
            }
        }
        return lonly;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(6);
        // list.add(5);
        // list.add(8);
        // System.out.println(isLonely(list));
        ArrayList<Boolean> list = new ArrayList<>();
        list.set(0, false);

        System.out.println(list);

    }
}
