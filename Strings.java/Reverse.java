import java.util.Stack;

public class Reverse {
    public static void reverse(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();


        int i=0 , n=str.length();
        while(i < n){
            s1.push(str.charAt(i));
            i++;
        }
        char ch;
        while (!s1.isEmpty()) {
            ch = s1.pop();
            if(ch == '.'){

                while(!s2.isEmpty()){
                    sb.append(s2.pop());
                }
                sb.append(ch);

            }else{
                s2.push(ch);
            } 
        }
        sb.append(s2.pop());
       System.out.println(sb.toString());
    }
    public static void main(String[] args){
        String str = "i.am.happy";
        reverse(str);
    }
}
