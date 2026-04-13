import java.util.function.Consumer;

public class task11 {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello");
    }
}

