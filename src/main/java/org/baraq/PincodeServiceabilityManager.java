package org.baraq;

import java.util.HashMap;
import java.util.Map;

public class PincodeServiceabilityManager {
    private Map<String, PincodeServiceability> serviceabilities = new HashMap<>();

    public void createServiceability(String sourcePincode, String destinationPincode, boolean codServiceable, boolean prepaidServiceable) {
        String key = sourcePincode + "-" + destinationPincode;
        PincodeServiceability serviceability = new PincodeServiceability(sourcePincode, destinationPincode, codServiceable, prepaidServiceable);
        serviceabilities.put(key, serviceability);
    }

    public PincodeServiceability getServiceability(String sourcePincode, String destinationPincode) {
        String key = sourcePincode + "-" + destinationPincode;
        return serviceabilities.get(key);
    }
}
