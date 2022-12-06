package com.example.xpensetracker;

public class TransactionClass {
    private int amount;
    private String description;
    private boolean positive;

    public TransactionClass(int amount, String description, boolean positive) {
        this.amount = amount;
        this.description = description;
        this.positive = positive;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
}
