
package com.sriram.codes;

import java.util.ArrayList;
import java.util.Scanner;

class Product {

    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

public class CartManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        int choice;
        double total = 0;
        double discount = 0;
        double finalAmount = 0;

        boolean billCalculated = false;
        boolean discountApplied = false;

        while (true) {

            System.out.println("\n===== SUPERMARKET MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Apply Discount");
            System.out.println("4. Display Final Amount");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {

                    System.out.print("How many products do you want to add? ");
                    int n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {

                        System.out.println("\nEnter Product " + i + " Details:");

                        System.out.print("Product Name: ");
                        String name = sc.next();

                        System.out.print("Product Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Quantity: ");
                        int quantity = sc.nextInt();

                        if (price <= 0 || quantity <= 0) {
                            System.out.println("Invalid price or quantity!");
                            continue;
                        }

                        Product p = new Product(name, price, quantity);

                        products.add(p);

                        System.out.println("Product added successfully!");
                    }

                    billCalculated = false;
                    discountApplied = false;
                }

                case 2 -> {

                    if (products.isEmpty()) {
                        System.out.println("Please add products first!");
                    } else {

                        total = 0;

                        for (Product p : products) {
                            total = total + p.getTotalPrice();
                        }

                        billCalculated = true;
                        discountApplied = false;

                        System.out.println("\nTotal Bill Amount: " + total);
                    }
                }

                case 3 -> {

                    if (!billCalculated) {
                        System.out.println("Please calculate the bill first!");
                    } else {

                        if (total > 10000) {

                            discount = total * 0.15;

                            finalAmount = total - discount;

                            discountApplied = true;

                            System.out.println("15% Discount Applied!");
                            System.out.println("Discount Amount: " + discount);

                        } else {

                            discount = 0;
                            finalAmount = total;

                            discountApplied = true;

                            System.out.println("No Discount Applicable.");
                            System.out.println("Total Amount: " + total);
                        }
                    }
                }

                case 4 -> {

                    if (!billCalculated) {
                        System.out.println("Please calculate the bill first!");
                    } else {

                        if (!discountApplied) {
                            finalAmount = total;
                            discount = 0;
                        }

                        System.out.println("\n========== FINAL BILL ==========");

                        System.out.println("Product Name\tPrice\tQuantity\tTotal");

                        for (Product p : products) {

                            System.out.println(
                                p.name + "\t\t" +
                                p.price + "\t" +
                                p.quantity + "\t\t" +
                                p.getTotalPrice()
                            );
                        }

                        System.out.println("--------------------------------");

                        System.out.println("Total Amount: " + total);
                        System.out.println("Discount: " + discount);
                        System.out.println("Final Amount: " + finalAmount);

                        System.out.println("================================");
                    }
                }

                case 5 -> {

                    System.out.println("Thank you for shopping!");
                    System.out.println("Exiting application...");

                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Please try again.");

            }
        }
    }
}
