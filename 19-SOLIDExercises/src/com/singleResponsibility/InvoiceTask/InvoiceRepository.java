package com.singleResposnibility.InvoiceTask;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {
    private List<Invoice> invoices = new ArrayList<>();

    public void saveInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public List<Invoice> findAll(){
        return new ArrayList<>(invoices);
    }

    public String printInvoice(int id) {
        for(Invoice invoice : invoices){
            if(invoice.getId() == id){
                return invoice.toString();
            }
        }

        return null;
    }
}
