import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String name1="Atharva";
        //String name=new String("Atharva");
        //System.out.println(name);
    //     String name=sc.next();
    //     System.out.println(name);
    //    String name1=sc.nextLine();
    //     System.out.println(name1);
    //FUNCTIONS INSIDE STRING
        String name="Atharva";
        String name2=" kabade"; 
        //System.out.println(name.length());       //length() function;
        //System.out.println(name+" "+name2);      //String concatination;(+)
        //System.out.println(name.charAt(2));        // .charAt(index)
        
        // to print loop using .charAt()
        // for(int i=0;i<name.length();i++){
        //     System.out.print(name.charAt(i)+" ");
        // } 
        // System.out.println();
            // String a="atharva";
            // String b="atharva";
            // System.out.println(a==b);
            //System.out.println(new int[]{1,2,3,4});       //gives garbage value
            //System.out.println(Arrays.toString(new int[]{1,2,3,4})); // it will print the array it is known as function overriding;
            // float a=10.28856f;
            // System.out.printf("the formated output is %.2f",a);
            //System.out.printf("my name is %s and i am %s","atharva","fit");

           // operators
            System.out.println("a"+"b");   //return ab
            System.out.println('a'+'b');  //returns value
            System.out.println('a'+3); // value a=97+3=100
            System.out.println((char)('a'+3)); //will return character at that ascii value
            System.out.println("a"+3); //a3   :: int will convert to Integer that will call toString() and return a3
            //System.out.println((char)("a"+3)); //error

        }
}
