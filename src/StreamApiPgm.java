import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiPgm {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);

        // Question: Update a list where it has duplicate elements to unique elements
        // without stream api
        List<String> list1 = new ArrayList<>();
        for (String element : list) {
            if (!list1.contains(element)) {
                list1.add(element);
            }
        }
        System.out.println(list1);

        // Question: Update a list where it has duplicate elements to unique elements
        // without stream api using set
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);

        System.out.println();
        // Question: Update a list where it has duplicate elements to unique elements
        // using stream api
        List<String> unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

        System.out.println();
        //Question: Given a list of integers, filter the even numbers.
        List<Integer> nums = List.of(1,6,0,88,7,54,3,55,88,6,2);
        nums.stream().filter(n-> n%2==0).distinct().forEach(System.out::println);

        System.out.println();
        //Question: Find the maximum number from a list of integers.
        nums.stream().max(Integer::compare).ifPresent(System.out::println);

        System.out.println();
        //Question: Find the second largest number from a list of integers.
        nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        System.out.println();
        //Question: Print unique elements in reverse order from a list of integers.
        nums.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println();
        //Question: Print unique elements in order from a list of integers.
        nums.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        System.out.println();
        //Question: Print strings starting with a specific prefix, e.g., “A”.
        List<String> names = Arrays.asList("Laksh","Jaya","john","Riya","Sam","Lucy");
        names.stream().map(String::toLowerCase).filter(s-> s.startsWith("j")).forEach(System.out::println);

        System.out.println();
        //Question: Count strings starting with a specific prefix, e.g., “L”.
        System.out.println(names.stream().map(String::toUpperCase).filter(s-> s.startsWith("L")).count());

        System.out.println();
        //Question: Find the first non-repeated character in a string.
        String s = "Vennela";
        s.chars().mapToObj(c->(char)c).filter(c-> s.indexOf(c)== s.lastIndexOf(c)).findFirst().ifPresent(System.out::println);
        s.chars().parallel().mapToObj(c->(char)c).filter(c-> s.indexOf(c)== s.lastIndexOf(c)).findAny().ifPresent(System.out::println);

        System.out.println();
        //Question: Convert all strings in a list to uppercase.
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println();
        //Question: Calculate the sum of all numbers in a list.
        System.out.println( nums.stream().mapToInt(Integer::intValue).sum());
       
        System.out.println();
        //Question: Check if any string in a list contains “API”.
        names.stream().filter(n -> n.contains("ya")).forEach(System.out::println);
        System.out.println(names.stream().anyMatch(m-> m.contains("sh")));

        System.out.println();
        //Question: Identify duplicate elements in a list.
        Set<String> set1 = new HashSet<>();
        list.stream().filter(x-> !set1.add(x)).forEach(System.out::println);

        System.out.println();
        //Question: Group a list of strings based on their length.
        Map<Integer, List<String>> strLengrp = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(strLengrp);




    }

}
