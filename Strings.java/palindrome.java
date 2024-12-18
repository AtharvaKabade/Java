import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class palindrome {
    public static boolean isPalindrome(String s1){
       
        for(int i=0;i<s1.length()/2;i++){
            int n=s1.length();
            if(s1.charAt(i)!=s1.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        System.out.println(isPalindrome(s1));
    }
}
