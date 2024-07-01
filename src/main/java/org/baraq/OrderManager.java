package org.baraq;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<String, Order> orders = new HashMap<>();
    private ProductManager productManager;
    private PincodeServiceabilityManager pincodeServiceabilityManager;

    public OrderManager(ProductManager productManager, PincodeServiceabilityManager pincodeServiceabilityManager) {
        this.productManager = productManager;
        this.pincodeServiceabilityManager = pincodeServiceabilityManager;
    }

    public String createOrder(String buyerId, String productId, int quantity, String paymentMode) throws Exception {
        Product product = productManager.getProduct(productId);
        if (product == null) {
            throw new Exception("Product not found");
        }

        PincodeServiceability serviceability = pincodeServiceabilityManager.getServiceability(product.getPickupAddress(), product.getPickupAddress());
        if (serviceability == null || (!serviceability.isCodServiceable() && !serviceability.isPrepaidServiceable())) {
            throw new Exception("Order failed because pincode is unserviceable");
        }

        if (quantity > product.getInventory()) {
            throw new Exception("Order failed because product stock is insufficient");
        }

        String orderId = "O" + (orders.size() + 1);
        Order order = new Order(orderId, buyerId, productId, quantity, paymentMode);
        orders.put(orderId, order);

        // Reduce inventory
        product.setInventory(product.getInventory() - quantity);

        return orderId;
    }
}

