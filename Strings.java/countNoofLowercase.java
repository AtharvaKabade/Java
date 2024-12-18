import java.util.*;
public class countNoofLowercase {
    public static int noOflowercase(String str){
        Integer count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
            }
        }
        return count;
    }
    public static int vowels(String str){
        int num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
         String str = "abcdAc";
        // Scanner sc=new Scanner(System.in);
        // str=sc.nextLine();
         System.out.println(noOflowercase(str));
        // System.out.println(vowels(str));
        // String str1 = "ApnaCollage".replace("l", "");
        // System.out.println(str1);

    }
}
