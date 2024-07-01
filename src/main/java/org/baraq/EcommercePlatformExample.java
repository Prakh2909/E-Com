package org.baraq;

public class EcommercePlatformExample {
    public static void main(String[] args) {
        // Initialize managers
        BuyerManager buyerManager = new BuyerManager();
        ProductManager productManager = new ProductManager();
        PincodeServiceabilityManager pincodeServiceabilityManager = new PincodeServiceabilityManager();
        OrderManager orderManager = new OrderManager(productManager, pincodeServiceabilityManager);

        // Create a buyer
        String buyerId1 = buyerManager.createBuyer("John Doe", "145236");

        // Create a product
        String productId1 = productManager.createProduct("Smartphone", 10, 500.00, "123 Main St, City");

        // Create a buyer2
        String buyerId2 = buyerManager.createBuyer("John Doe", "123456");

        // Create a product2
        String productId2 = productManager.createProduct("Smartphone", 10, 500.00, "789101112");

        // Set pincode serviceability
        pincodeServiceabilityManager.createServiceability("123 Main St, City", "123 Main St, City", true, true);

        try {
            // Create an order (valid scenario)
            String orderId = orderManager.createOrder(buyerId1, productId1, 1, "prepaid");
            System.out.println("Order created successfully. Order ID: " + orderId);

            // Create an order (invalid scenario due to pincode serviceability)
            // In this example, we're using the same pickup and destination pin codes
            // which are not registered as serviceable
            String invalidOrderId = orderManager.createOrder(buyerId2, productId2, 1, "cod");
            System.out.println("Order created successfully. Order ID: " + invalidOrderId);

        } catch (Exception e) {
            System.out.println("Failed to create order: " + e.getMessage());
        }
    }
}
