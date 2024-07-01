package org.baraq;

import java.util.HashMap;
import java.util.Map;

public class BuyerManager {
    private Map<String, Buyer> buyers = new HashMap<>();
    private static int nextBuyerId = 1;

    public String createBuyer(String name, String address) {
        String buyerId = "B" + nextBuyerId++;
        Buyer buyer = new Buyer(buyerId, name, address);
        buyers.put(buyerId, buyer);
        return buyerId;
    }

    public Buyer getBuyer(String buyerId) {
        return buyers.get(buyerId);
    }
}

