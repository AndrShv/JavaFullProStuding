package Products;

import java.util.List;
import java.util.stream.Collectors;

public class DiscountApplier {
    public static List<Product> applyDiscount(List<Product> products) {
        return products.stream()
                .filter(Product::isDiscountApplicable)
                .map(product -> {
                    Product discountedProduct = new Product(product.getType(), product.bookName, product.getPrice(), product.isDiscountApplicable(), product.getDateAdded());
                    discountedProduct.applyDiscount(10);
                    return discountedProduct;
                })
                .collect(Collectors.toList());
    }
}
