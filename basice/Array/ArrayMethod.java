import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};

        // 1. length (property, not method)
        System.out.println("Length: " + arr.length);

        // 2. Arrays.toString()
        System.out.println("Original: " + Arrays.toString(arr));

        // 3. Arrays.sort()
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // 4. Arrays.copyOf()
        int[] copy = Arrays.copyOf(arr, 6);
        System.out.println("Copy with length 6: " + Arrays.toString(copy));

        // 5. Arrays.fill()
        Arrays.fill(copy, 4, 6, 0);  // Fill index 4 & 5 with 0
        System.out.println("After fill: " + Arrays.toString(copy));

        // 6. Arrays.equals()
        int[] another = {1, 2, 5, 8};
        System.out.println("Equals: " + Arrays.equals(arr, another)); // true

        // 7. Arrays.copyOfRange()
        int[] range = Arrays.copyOfRange(arr, 1, 3); // from index 1 to 2
        System.out.println("Copy of Range (1-2): " + Arrays.toString(range));

        // 8. Arrays.binarySearch()
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        // 9. Arrays.hashCode()
        System.out.println("HashCode: " + Arrays.hashCode(arr));

        // 10. Arrays.asList() (for object arrays)
        String[] names = {"Alice", "Bob"};
        System.out.println("As List: " + Arrays.asList(names));

        // 11. Arrays.stream()
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum using stream: " + sum);
    }
}
