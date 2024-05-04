package Products;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class MainStarterProduct {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        Product product1 = new Product("Book", "Harry Potter 1st Part", 300, true, now.minusDays(10));
        Product product2= new Product("Book", "Sherlock Holms", 200, true, now.minusDays(5));
        Product product3 = new Product("Book", "Little Prince", 150, false, now.minusDays(3));
        Product product4 = new Product("Book", "Harry Potter 2st Part", 350, false, now.minusDays(1));

        List<Product> products = Arrays.asList(product1, product2, product3, product4);

        List<Product> expensiveBooks = ExpensiveProductFinder.findExpensiveBooks(products);
        System.out.println("Expensive Books:");
        expensiveBooks.forEach(product -> System.out.println("Name: " + product.bookName() + ", Price: " + product.getPrice() + ", AddData: " + product.getDateAdded()));

        List<Product> discountedBooks = DiscountApplier.applyDiscount(products);
        System.out.println("\nBooks With Discount:");
        discountedBooks.forEach(product -> System.out.println("Name: " + product.bookName() + ", Price with discount: " + product.getPrice()));

        Product cheapestBook = CheapestProductFinder.findCheapestBook(products);
        System.out.println("\nCheapest Books:");
        System.out.println("Name: " + cheapestBook.bookName() + ", Price: " + cheapestBook.getPrice());
    }
}

