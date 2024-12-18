public class ToUppercase {
    public static String uppercase(String str){
        StringBuilder sb=new StringBuilder("");    // we created stringbuilder sb
        char ch=Character.toUpperCase(str.charAt(0)); // we made first letter of string to uppercase
        sb.append(ch);                                  //we saved that uppercase letter in stringbuilder sb
        for(int i=1;i<str.length();i++){                 
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));               // if we found space we add that to sb
                i++;                                    // we incremented i to get next character so that we can make it to uppercase
                sb.append(Character.toUpperCase(str.charAt(i))); // we make next character to uppercase and added it to sb 
            }
            else{
                sb.append(str.charAt(i));           // otherwise we will add the character to sb
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="i study in rit";
        System.out.println(" the modified string is "+ uppercase(str));
    }
}
