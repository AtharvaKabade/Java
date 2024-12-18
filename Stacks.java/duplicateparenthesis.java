import java.util.Stack;

public class duplicateparenthesis {
    public static boolean isDublicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if(ch==')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate exist
                }
                else{
                    s.pop();  //remove the opening pair from stack
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 ="((a+b))"; //true
        String str2 = "(a-b)"; //false
        System.out.println(isDublicate(str1)); 
    }
}
