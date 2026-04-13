import java.util.*;
import java.util.stream.Collectors;

public class task16 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ali", "Aruzhan", "Bob");

        Map<Integer, List<String>> map =
                list.stream()
                        .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}
