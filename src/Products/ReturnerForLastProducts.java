package Products;

import java.util.Comparator;
import java.util.Arrays;

public class ReturnerForLastProducts {

    public static Product[] returnLastProducts(Product[] products) {


        Arrays.sort(products, Comparator.comparing(Product::getDateAdded).reversed());

        return Arrays.stream(products)
                .skip(Math.max(0, products.length - 3))
                .toArray(Product[]::new);
    }
}
