import java.util.HashMap;

class Restaurant {
    private HashMap<String, Order> orders;

    public Restaurant() {
        orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        orders.put(order.getOrderNumber(), order);
    }

    public void removeOrder(String orderNumber) {
        orders.remove(orderNumber);
    }

    public void findOrder(String orderNumber) {
        Order order = orders.get(orderNumber);
        if (order == null) {
            System.out.println("такого замовлення немає");
        } else {
            System.out.println(order);
        }
    }

    public void printOrders() {
        for (Order o : orders.values()) {
            System.out.println(o);
        }
    }
}
