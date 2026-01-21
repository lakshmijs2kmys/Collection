/*Print only values that are duplicated in the array using Java8. */
package practice;

import java.util.Arrays;
import java.util.Map;   
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;

public class DuplicatevaluesinCollection {
    public static void main(String[] args) {
        int[] arr = {1,1,2, 2, 3, 4, 5, 6, 7, 8,8, 9, 10};
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,1,2,2,3,4,5,6,7,8,8,9,10);
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
