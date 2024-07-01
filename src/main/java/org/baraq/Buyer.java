package org.baraq;

public class Buyer {
    private String buyerId;
    private String name;
    private String address;

    public Buyer(String buyerId, String name, String address) {
        this.buyerId = buyerId;
        this.name = name;
        this.address = address;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
