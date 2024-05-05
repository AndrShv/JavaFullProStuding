package Products;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CheapestProductFinder {

    public static Product findCheapestBook(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("Book"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("Product [category: Book] not found"));
    }
}
