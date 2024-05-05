package Products;

import java.util.List;
import java.util.Objects;

public class calculateFinalProducts {


    public static int calculateFinalProductValue(List<Product> products) {
        return (int) products.stream()
                .filter(product -> product.getPrice() <= 75)
                .filter(product -> Objects.equals(product.getType(), "Book"))
                .mapToDouble(Product::getPrice)
                .sum();
    }


}
