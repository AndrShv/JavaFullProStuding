package CoffeeOrder;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void add(Order order) {
        order.setOrderNumber(orders.size() + 1);
        orders.add(order);
    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void display() {
        System.out.println("============= \nNum | Name\n=============");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}
