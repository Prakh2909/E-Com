package org.baraq;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private Map<String, Product> products = new HashMap<>();
    private static int nextProductId = 1;

    public String createProduct(String name, int inventory, double price, String pickupAddress) {
        String productId = "P" + nextProductId++;
        Product product = new Product(productId, name, inventory, price, pickupAddress);
        products.put(productId, product);
        return productId;
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }
}

