package CoffeeOrder;

public class CoffeeStarter {
    public static void main(String[] args) {
        CoffeeOrderBoard  coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add(new Order(1, "John"));
        coffeeOrderBoard.add(new Order(2, "Alice"));
        coffeeOrderBoard.add(new Order(3, "Alex"));

        System.out.println("Current orders:");
        coffeeOrderBoard.display();

        System.out.println("Delivering the next order:");
        Order nextOrder = coffeeOrderBoard.deliver();


        if (nextOrder != null) {
            System.out.println("Order Number: " + nextOrder.getOrderNumber() + ", Customer Name: " + nextOrder.getCustomerName());
        } else {
            System.out.println("No orders available.");
        }

        System.out.println("Delivering order with number 2:");
        Order orderWithNumber2 = coffeeOrderBoard.deliver(2);


        if (orderWithNumber2 != null) {
            System.out.println("Order Number: " + orderWithNumber2.getOrderNumber() + ", Customer Name: " + orderWithNumber2.getCustomerName());
        } else {
            System.out.println("Order with number 2 not found.");
        }


        System.out.println("Updated orders:");
        coffeeOrderBoard.display();
    }

    }

