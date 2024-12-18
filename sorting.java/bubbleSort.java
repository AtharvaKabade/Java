 import java.util.*;
 public class bubbleSort {
   
    public static void BubbleSort(int arr[]){
        int swap=0;
        for(int turn=0;turn < arr.length-1;turn++){   // arr.length-1 bcz we need (n-1) iteration
          
            for(int j=0;j<arr.length-1-turn;j++){   //arr.length-1-turn  bcz we will swap number till the index (arr.length-1-turn) 
                if(arr[j]>arr[j+1]){                //no need to compair last bubbled element and this bubbled element.
                    //swap
                    swap++;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }   
        }
        if(swap==0){
            System.out.println("array is already sorted");
        }else
        System.out.println("number of swaps = "+swap);
    }
    public static void ShowArray(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void bubbleSortRecursion(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(c < r){

            if(arr[c] > arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSortRecursion( arr, r,c+1);
        }else{
            bubbleSortRecursion( arr, r-1,0);
        }
    }
    
    public static void main(String[] args) {
        int arr[]={4,6,1,5,3,7};
        //BubbleSort(arr);
        //ShowArray(arr);
        bubbleSortRecursion( arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

}
