package com.openClosePrinciple.DiscountTask;

public class RunDiscountType {
    public static void main(String[] args) {
        DiscountType type = DiscountType.STUDENT;
        System.out.println(calculateDiscount(type, 100));
    }

    public static double calculateDiscount(DiscountType type, double price) {
        return price - price * type.getRate();
    }
}
