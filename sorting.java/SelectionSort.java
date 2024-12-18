public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){// loop 0 to n-1 tak chalega to find min    //here we counted no of turns
            int minPos=i;           //let current position be small
            for(int j=i+1;j<arr.length;j++){        // find the smallest element in array and j+1 bcz unsorted arry starts from there
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            // swap the smallest element is swapped with current position
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,54,34,12,40};
        selectionSort(arr);
        printArray(arr);
    }
}
