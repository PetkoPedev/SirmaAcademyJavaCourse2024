package com.singleResposnibility.InvoiceTask;

public class Invoice {
    private int Id;
    private double amount;
    private String customerName;
    private String senderName;
    private String description;

    public Invoice(int id, double amount, String customerName, String senderName, String description) {
        this.Id = id;
        this.amount = amount;
        this.customerName = customerName;
        this.senderName = senderName;
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "Id=" + Id +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                ", senderName='" + senderName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
