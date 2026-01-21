/*Given the following examples of integer arrays:

[1, 2, 4, 7, 5, 3, 8] // Expected output: 7

[1] // Expected output: (no output, as there is no second highest number)

[1, 2] // Expected output: 1

Write a single Java 8 stream operation to print the second highest number in each array. */
package practice;
import java.util.Arrays;
import java.util.Comparator;
public class secondLagrestNum {
    public static void main(String[] args) {
       // int[] arr = {1, 2, 4, 7, 5, 3, 8};
       int[] arr = {1};
        // Using Java 8 Stream to find the second largest number
      Arrays.stream(arr)
                .distinct() 
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }

    
}
