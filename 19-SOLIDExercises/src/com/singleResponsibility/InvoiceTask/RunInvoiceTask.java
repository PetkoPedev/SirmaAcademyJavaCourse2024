package com.singleResposnibility.InvoiceTask;

import java.util.List;

public class RunInvoiceTask {
    public static void main(String[] args) {
        invoiceDatabase();
    }

    private static void invoiceDatabase() {
        Invoice invoice1 = new Invoice(1, 20.00, "John Doe", "Jane Doe", "To be delivered by noon.");
        Invoice invoice2 = new Invoice(2, 320.00, "Peter Pan", "Mary Jane", "To be delivered by morning.");
        Invoice invoice3 = new Invoice(3, 430.00, "Pesho", "Ivan", "To be delivered by morning.");

        InvoiceRepository repository = new InvoiceRepository();

        repository.saveInvoice(invoice1);
        repository.saveInvoice(invoice2);
        repository.saveInvoice(invoice3);

        System.out.println(invoice1.getDescription());

        List<Invoice> invoicesCollection = repository.findAll();
        for(Invoice invoice : invoicesCollection){
            System.out.println(invoice.getSenderName());
        }

    }
}
