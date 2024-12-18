import java.util.*;
public class substring {
    public static String Substring(String str,int si,int ei){
        String sub=" ";
        for(int i=si;i<ei;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str="HelloWord";
       // System.out.println("The sub string is "+Substring(str,0,5));
       System.out.println(str.substring(0, 5));         //inbuilt function for substring
    }
}
