package practice;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class newpgm {
    public static void main(String[] args) {
    String name = "aabbvcvdd";
    Map<Character, Long> map =name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    map.keySet().stream().filter(f->map.get(f) == 1).forEach(System.out::println);
}   

}
