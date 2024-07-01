package org.baraq;

public class Product {
    private String productId;
    private String name;
    private int inventory;
    private double price;
    private String pickupAddress;

    public Product(String productId, String name, int inventory, double price, String pickupAddress) {
        this.productId = productId;
        this.name = name;
        this.inventory = inventory;
        this.price = price;
        this.pickupAddress = pickupAddress;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }
}
