package Products;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class MainStarterProduct {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        Product[] products = {
                new Product("Book", "HarryPotter Part1", 50, true, LocalDateTime.now().minusDays(3)),
                new Product("Book", "Scary Doctor", 20, true, LocalDateTime.now().minusDays(2)),
                new Product("Book", "Little Prince", 95, true, LocalDateTime.now().minusDays(1)),
                new Product("Book", "HarryPotter Part2", 120, true, LocalDateTime.now().minusDays(5)),
                new Product("Book", "Historical Stories", 85, true, LocalDateTime.now().minusDays(4))
        };

        List<Product> expensiveBooks = ExpensiveProductFinder.findExpensiveBooks(List.of(products));
        System.out.println("Expensive Books:");
        expensiveBooks.forEach(product -> System.out.println("Name: " + product.bookName() + ", Price: " + product.getPrice() + ", AddData: " + product.getDateAdded()));

        List<Product> discountedBooks = DiscountApplier.applyDiscount(List.of(products));
        System.out.println("\nBooks With Discount:");
        discountedBooks.forEach(product -> System.out.println("Name: " + product.bookName() + ", Price with discount: " + product.getPrice()));

        Product cheapestBook = CheapestProductFinder.findCheapestBook(List.of(products));
        System.out.println("\nCheapest Books:");
        System.out.println("Name: " + cheapestBook.bookName() + ", Price: " + cheapestBook.getPrice());



        System.out.println("\nLast 3 Products:");
        Product[] lastProducts = ReturnerForLastProducts.returnLastProducts(products);
        for (Product product : lastProducts) {
            System.out.println(product.getType() + ": " + product.bookName() + " - " + product.getDateAdded());
        }

        int finalValue = calculateFinalProducts.calculateFinalProductValue(List.of(products));
        System.out.println("\nFinal product sum of products meeting the criteria: " + finalValue);
    }
}

