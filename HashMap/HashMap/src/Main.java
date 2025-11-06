//Завдання 3: Управління замовленнями в ресторані

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(); // створюємо ресторан

        // створюємо замовлення
        Order o1 = new Order("001", "Sasha");
        o1.addDish("Pizza");
        o1.addDish("Coca-Cola");

        Order o2 = new Order("002", "Kate");
        o2.addDish("Pasta");

        Order o3 = new Order("003", "Dasha");
        o3.addDish("Soup");
        o3.addDish("Salad");
        o3.addDish("Juice");

        // додаємо замовлення в ресторан
        restaurant.addOrder(o1);
        restaurant.addOrder(o2);
        restaurant.addOrder(o3);

        // виводимо всі замовлення
        System.out.println("All Orders:");
        restaurant.printOrders();

        // шукаємо замовлення
        System.out.println("\nшукаемо замовлення:");
        restaurant.findOrder("001");
        restaurant.findOrder("010");
        restaurant.findOrder("002");

        // видаляємо замовлення
        restaurant.removeOrder("002");
        System.out.println("\nпісля прибирання замовлення 002:");
        restaurant.printOrders();
    }
}
