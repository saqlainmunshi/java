public class traarayrec {

        public static void traverseArray(int[] arr, int index) {
            if (index == arr.length) {
                return; // Base case: stop when the index reaches the end
            }
            System.out.print(arr[index] + " "); // Process current element
            traverseArray(arr, index + 1); // Recursive call for the next element
        }
    
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            traverseArray(numbers, 0); // Start from index 0
        }
    }
    

