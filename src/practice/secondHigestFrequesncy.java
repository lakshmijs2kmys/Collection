/*Given an array of elements (e.g., strings, integers, etc.), find the element with the second highest frequency.

Input: ["apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana"]

Frequencies:

- apple → 3

- banana → 3

- orange → 2

Second highest frequency = 2 → Output: orange */

package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;


public class secondHigestFrequesncy {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana"};
        Map<String, Long> frequencyMap = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .ifPresent(entry -> System.out.println("Second highest frequency element: " + entry.getKey()));

    
    //List<Integer> list = Arrays.asList(10,10,20,20,20,30,30);
    List<String> list = Arrays.asList(arr);
    list.stream().collect(Collectors.groupingBy(c->c, Collectors.counting())).entrySet().stream().sorted((e1,e2) -> e1.getValue().compareTo(e2.getValue())).skip(1).findFirst().ifPresent(e -> System.out.println("Second highest frequency element: " + e.getKey()));
    }
}
