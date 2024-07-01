package org.baraq;

public class PincodeServiceability {
    private String sourcePincode;
    private String destinationPincode;
    private boolean codServiceable;
    private boolean prepaidServiceable;

    public PincodeServiceability(String sourcePincode, String destinationPincode, boolean codServiceable, boolean prepaidServiceable) {
        this.sourcePincode = sourcePincode;
        this.destinationPincode = destinationPincode;
        this.codServiceable = codServiceable;
        this.prepaidServiceable = prepaidServiceable;
    }

    public String getSourcePincode() {
        return sourcePincode;
    }

    public void setSourcePincode(String sourcePincode) {
        this.sourcePincode = sourcePincode;
    }

    public String getDestinationPincode() {
        return destinationPincode;
    }

    public void setDestinationPincode(String destinationPincode) {
        this.destinationPincode = destinationPincode;
    }

    public boolean isCodServiceable() {
        return codServiceable;
    }

    public void setCodServiceable(boolean codServiceable) {
        this.codServiceable = codServiceable;
    }

    public boolean isPrepaidServiceable() {
        return prepaidServiceable;
    }

    public void setPrepaidServiceable(boolean prepaidServiceable) {
        this.prepaidServiceable = prepaidServiceable;
    }
}


