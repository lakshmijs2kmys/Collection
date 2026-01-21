/* Return Squares of All Odd Numbers

You are given a List<Integer> as input. Return a new list containing the squares of all odd numbers, in the same order as they appear.

Example
Input:

List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5); 
Output:

[1, 9, 25]  // squares of 1, 3, 5 (odd numbers)  */
package practice;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class squareOfOddNo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = nums.stream().filter(i-> i%2!=0).map(n-> n*n).collect(Collectors.toList());
        System.out.println(result);
        int[] arr = {1,2,3,4,5};
        int[] r = IntStream.of(arr).filter(i-> i%2==0).map(n-> n*n).toArray();
        System.out.println(Arrays.toString(r));
    }
}