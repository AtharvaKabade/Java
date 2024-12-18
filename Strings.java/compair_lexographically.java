public class compair_lexographically {
    public static String Greatest(String Cars[],String large){
        for(int i=1;i<Cars.length;i++){
            if(large.compareTo(Cars[i]) < 0){    // 0 is the index and compair it with all other strings
                large=Cars[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        String Cars[]={"zz","bmw" ," mercidies","rolls_royce","zzd"};
        String large = Cars[0];
        System.out.println(Greatest(Cars, large));
    }
}
