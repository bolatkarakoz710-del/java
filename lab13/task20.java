import java.util.*;
import java.util.stream.Collectors;

class Order {
    String product;
    int price;

    Order(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String toString() {
        return product + " " + price;
    }
}

public class task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Phone", 300),
                new Order("Laptop", 800),
                new Order("Mouse", 50)
        );

        orders.stream()
                .filter(o -> o.price > 100)
                .sorted(Comparator.comparing(o -> o.price))
                .forEach(System.out::println);
    }
}