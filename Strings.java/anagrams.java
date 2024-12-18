import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        String s1="earth";
        String s2="heart";

        //convert string to lowercase. why? so that we dont need to check for uppercase and lowercase seperately
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        //first check -if length are same 
        if(s1.length() == s2.length()){
            //convert the strings into char array
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            //sort the char array
            Arrays.sort(c1);
            Arrays.sort(c2);

            // if sorted array are same or identical then the string are anagrams
            boolean result=Arrays.equals(c1, c2);
            if(result){
                System.out.println(s1+" and "+s2 +" are anagrams of each other");
            }else{
                System.out.println(s1 +" and "+s2+" are not anagrams of each other");
            }

        }else{
            System.out.println(s1 +" and "+s2+" are not anagrams of each other");
        }
    }
}
