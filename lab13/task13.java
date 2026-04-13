import java.util.*;

public class task13 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "kiwi", "banana");

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}