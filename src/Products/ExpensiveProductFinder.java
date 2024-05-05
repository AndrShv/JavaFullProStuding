package Products;

import java.util.List;
import java.util.stream.Collectors;

public class ExpensiveProductFinder {
    public static List<Product> findExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }
}
