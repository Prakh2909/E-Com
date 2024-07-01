package org.baraq;

public class Order {
    private static int orderIdCounter = 1;

    private String orderId;
    private String buyerId;
    private String productId;
    private int quantity;
    private String paymentMode;

    public Order(String orderId, String buyerId, String productId, int quantity, String paymentMode) {
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.productId = productId;
        this.quantity = quantity;
        this.paymentMode = paymentMode;
    }

    public static int getOrderIdCounter() {
        return orderIdCounter;
    }

    public static void setOrderIdCounter(int orderIdCounter) {
        Order.orderIdCounter = orderIdCounter;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }


}

