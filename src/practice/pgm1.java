package practice;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class pgm1 {
    public static void main(String[] args) {
        String str ="Java";
        str = str.replace('a', 'o');
        System.out.println(str);

        Map<Character, Long> map = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long maxOcc = map.values().stream().mapToLong(Long::longValue).max().orElse(0);
         maxOcc % 2 == 0;
    }
}
