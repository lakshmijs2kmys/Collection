/*Maximum sum of two integers from an array that have common first and last digits.

There is an array A consisting of N integers. What is the maximum sum of two integers from A that
 have common first and last digits? If there are no two integers that have common first and last digits,
  the function should return −1.

Examples:

1. Given A = [130, 191, 10, 200], the function should return 140. The only integers in A
 that share first and last digits are 130 and 10.

2. Given A = [405, 45, 300, 300], the function should return 600. There are two pairs of 
integers that share first and last digits: (405, 45) and (300, 300). The sum of the two 300s 
is bigger than the sum of 405 and 45.

3. Given A = [30, 909, 3190, 99, 3990, 9009], the function should return 9918.

*/
package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class sumOf2num {
    public static void main(String[] args) {
        int[] arr = {405, 45, 300, 300};
        int sum = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String str1 = Integer.toString(arr[i]);
                String str2 = Integer.toString(arr[j]);
                if (str1.charAt(0) == str2.charAt(0) && str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) {
                    int currentSum = arr[i] + arr[j];
                    if (currentSum > sum) {
                        sum = currentSum;
                    }
                }
            }
        }

        Map<String, List<Integer>> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(a -> a.toString().charAt(0) + "" + a.toString().charAt(a.toString().length() - 1)));
        int total =map.values().stream().filter(list -> list.size() >= 2).mapToInt(list -> {list.sort(Collections.reverseOrder()); return list.get(0) + list.get(1);}).max().orElse(-1);
        System.out.println("Sum of 2 numbers: " + sum);
        System.out.println("Sum of 2 numbers: " + total);
        System.out.println(map);
    }
    
}
