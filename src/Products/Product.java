package Products;

import java.time.LocalDateTime;

public class Product {
    String bookName;
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDateTime dateAdded;

    public Product(String type, String bookName, double price, boolean discountApplicable, LocalDateTime dateAdded) {
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.dateAdded = dateAdded;
        this.bookName = bookName;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountApplicable() {
        return discountApplicable;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void applyDiscount(double discountPercentage) {
        this.price *= (1 - discountPercentage / 100);
    }

    public String bookName() {
        return bookName;
    }

    public Product setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }
}

