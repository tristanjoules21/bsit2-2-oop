public class Main {
    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===\n");

        System.out.println("Creating orders and adding items...");

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");

        // Valid additions
        try {
            order1.addItem("Pizza", 12.99);
            order1.addItem("Pasta", 9.75);
            order1.addItem("Drink", 1.99);
            System.out.println("Item 'Pizza' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Valid multiple items
        try {
            order2.addMultipleItems(
                    new String[]{"Burger", "Fries", "Shake", "Nuggets", "Cola"},
                    8.50, 3.25, 5.00, 10.00, 5.70
            );
            System.out.println("Items added: Burger, Fries, Shake, Nuggets, Cola");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Multiple invalid items to trigger errors
        try {
            order3.addMultipleItems(
                    new String[]{"Salad", "", "Water", "Ice Cream"},
                    6.50, -3.00, 9.00, 0.0  // empty item, negative price, zero price
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mismatched arrays length - error expected
        try {
            order3.addMultipleItems(new String[]{"Soup", "Juice"}, 4.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try adding single item with empty name - error expected
        try {
            order1.addItem("", 4.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding single item: " + e.getMessage());
        }

        // Try adding single item with price zero - error expected
        try {
            order2.addItem("Cookie", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding single item: " + e.getMessage());
        }

        // Try adding single item with null name - error expected
        try {
            order2.addItem(null, 3.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding single item: " + e.getMessage());
        }

        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order[] orders = {order1, order2, order3};
        Order largest = orders[0];
        for (Order ord : orders) {
            if (ord.getTotalAmount() > largest.getTotalAmount()) {
                largest = ord;
            }
        }

        System.out.printf("Largest order: %s ($%.2f)%n",
                largest.getCustomerName(), largest.getTotalAmount());
    }
}
