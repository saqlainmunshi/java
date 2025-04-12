public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={35,2,6,7,78,35,6};
        arr = BubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = true;
            for (int j = 0; j < arr.length-i-1; j++) {
              if(arr[j]<arr[j+1]){
                arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
                swap = false;
              }
            }
            if (swap) {
                return arr;
            }

        }


        return arr;
        
    }
}
