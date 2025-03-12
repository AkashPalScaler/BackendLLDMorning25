package org.example.DesignPatterns.Adapter.Library;

public class HDFCBalanceResponse {
    Integer amount;
    boolean isBelowMin;

    public void setBelowMin(boolean belowMin) {
        isBelowMin = belowMin;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public boolean isBelowMin() {
        return isBelowMin;
    }
}
