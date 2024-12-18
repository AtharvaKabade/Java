import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer>list,int target){
        int bp=-1;  //breaking point
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1)){ //braeking point
                bp=i;
                break;
            }
        }
        int lp=bp+1;  //smallest element of array
        int rp=bp; //largest value in array

        while(lp!=rp){
            int n=list.size();
            if(list.get(rp)+list.get(lp)== target){
                return true;
            }
             if(list.get(rp)+list.get(lp)< target){
                lp=(lp+1)%n;  //rotational increment
            }
            else {
                rp=(n+rp-1)%n;   //rotational increment
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // 11,15, 6 ,8 ,9 ,10 Sorted and Rotated AL 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum(list, target));
    }
}
