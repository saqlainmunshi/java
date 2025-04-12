public class selectionSort {
    public static void main(String[] args) {
        int[] arr={35,2,6,7,78,35,6};
        arr = SelectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static int[] SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
               if(arr[small]>arr[j]){
                small = j;
               } 
            }
            
        arr[i]=arr[i]+arr[small]-(arr[small]=arr[i]);
        }


        return arr;
        
    }
}
