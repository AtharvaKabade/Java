import java.util.Stack;

public class Histogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]= new int[arr.length];
        int nsl[]= new int[arr.length];
        //Next smaller right
        Stack<Integer> s =new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //nrxt smaller left 
         s =new Stack<>(); //we emptyed the stack
        for(int i=0 ; i<arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area
        //width = nsr[i]-nsl[i]-1  or width = j-i-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea= height*width;
            maxArea=Math.max(maxArea, currArea);
        }
        System.out.println("Maximum area in my histogram is = "+ maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1,5,6,2,3};  //heights of histogram
        maxArea(arr);
    }
}
