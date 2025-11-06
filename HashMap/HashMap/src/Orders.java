import java.util.ArrayList;

class Order {
    private String orderNumber;
    private String customerName;
    private ArrayList<String> dishes;

    public Order(String orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.dishes = new ArrayList<>();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void addDish(String dish) {
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return "OrderNumber: " + orderNumber +
                "; Customer: " + customerName +
                "; Dishes: " + dishes;
    }
}


