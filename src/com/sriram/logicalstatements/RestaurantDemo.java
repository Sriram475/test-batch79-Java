package com.sriram.logicalstatements;

import java.util.Scanner;

public class RestaurantDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalbill = 0;
        String categoryChoice;

        do {
            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("1. Nonveg");
            System.out.println("2. Veg");
            System.out.println("3. Starters");
            System.out.println("Enter your category:");

            String category = sc.next().toLowerCase();

            String itemChoice;

            do {
                double item_price = 0;

                switch (category) {

                    case "nonveg" -> {
                        System.out.println("\n===== NON-VEG MENU =====");
                        System.out.println("chickenbiryani - 200");
                        System.out.println("eggfriedrice - 130");
                        System.out.println("muttonbiryani - 300");
                        System.out.println("chickenfriedrice - 180");
                        System.out.println("chicken65 - 180");
                        System.out.println("fishfry - 150");
                        System.out.println("prawnsfry - 220");

                        System.out.println("Enter your non-veg item:");
                        String nvitem = sc.next().toLowerCase();

                        switch (nvitem) {
                            case "chickenbiryani" -> item_price = 200;
                            case "eggfriedrice" -> item_price = 130;
                            case "muttonbiryani" -> item_price = 300;
                            case "chickenfriedrice" -> item_price = 180;
                            case "chicken65" -> item_price = 180;
                            case "fishfry" -> item_price = 150;
                            case "prawnsfry" -> item_price = 220;
                            default -> System.out.println("Invalid non-veg item!");
                        }
                    }

                    case "veg" -> {
                        System.out.println("\n===== VEG MENU =====");
                        System.out.println("vegfriedrice - 100");
                        System.out.println("vegmanchuria - 120");
                        System.out.println("masaladosa - 80");
                        System.out.println("paneerbuttermasala - 200");
                        System.out.println("vegnoodles - 110");
                        System.out.println("gobifry - 130");

                        System.out.println("Enter your veg item:");
                        String vitem = sc.next().toLowerCase();

                        switch (vitem) {
                            case "vegfriedrice" -> item_price = 100;
                            case "vegmanchuria" -> item_price = 120;
                            case "masaladosa" -> item_price = 80;
                            case "paneerbuttermasala" -> item_price = 200;
                            case "vegnoodles" -> item_price = 110;
                            case "gobifry" -> item_price = 130;
                            default -> System.out.println("Invalid veg item!");
                        }
                    }

                    case "starters" -> {
                        System.out.println("\n===== STARTERS MENU =====");
                        System.out.println("butterchicken - 260");
                        System.out.println("chickenlollipop - 220");
                        System.out.println("chickentikka - 240");
                        System.out.println("muttonkeema - 280");
                        System.out.println("honeyfish - 200");
                        System.out.println("crispyprawns - 280");

                        System.out.println("Enter your starter item:");
                        String staritem = sc.next().toLowerCase();

                        switch (staritem) {
                            case "butterchicken" -> item_price = 260;
                            case "chickenlollipop" -> item_price = 220;
                            case "chickentikka" -> item_price = 240;
                            case "muttonkeema" -> item_price = 280;
                            case "honeyfish" -> item_price = 200;
                            case "crispyprawns" -> item_price = 280;
                            default -> System.out.println("Invalid starter item!");
                        }
                    }

                    default -> System.out.println("Invalid category!");
                }

                if (item_price > 0) {
                    totalbill += item_price;

                    System.out.println("Item price: " + item_price);
                    System.out.println("Current total bill: " + totalbill);
                }

                System.out.println(
                    "\nDo you want another item in this category? (yes/no)"
                );

                itemChoice = sc.next();

            } while (itemChoice.equalsIgnoreCase("yes")
                    || itemChoice.equalsIgnoreCase("y"));

            System.out.println(
                "\nDo you want to select another category? (yes/no)"
            );

            categoryChoice = sc.next();

        } while (categoryChoice.equalsIgnoreCase("yes")
                || categoryChoice.equalsIgnoreCase("y"));

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Your total bill amount is: " + totalbill);
        System.out.println("Thank you! Visit again.");

        sc.close();
    }
}