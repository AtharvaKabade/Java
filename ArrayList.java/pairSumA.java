import java.util.ArrayList;

public class pairSumA {
    public static boolean check(ArrayList<Integer> list,int target){
        int bp=0;
        int n=list.size();
        for(int i=0;i<list.size();i++){
         if(list.get(i) > list.get(i+1)){
            bp=i;
            break;
         }
        }
           int left = bp+1;
           int right=bp;
           while(left != right){
            int sum=list.get(left)+list.get(right);
                if(target == sum){
                    return true;
                }else if(target > sum){
                    left=(left+1)%n;
                }else{
                    right=(n+right-1)%n;
                }
           }
          return false;     
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(check(list,target));
    }
}
