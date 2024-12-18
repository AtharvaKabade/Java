public class noOfLetters {
    public static String nuberofchar(String str){
        String newStr="";                          // created a new string
        for(int i=0;i<str.length();i++){    
            Integer count=1;                       // count variable to check how many times the char is present
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){  //compair consecutive elements
                count++;
                i++;
            }
            newStr+=str.charAt(i);  
            newStr+=count.toString();               //we added that character to the newstring
            // if(count > 1){                           // if count is greater than 1 we add it to the newstring
                
            // }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="aaabbccddde";
        System.out.println(nuberofchar(str));
    } //
}
