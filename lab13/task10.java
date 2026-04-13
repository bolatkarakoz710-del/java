import java.util.*;

public class task10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,9);

        int min = list.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}