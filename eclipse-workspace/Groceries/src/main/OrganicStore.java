package main;

import java.util.ArrayList;
import java.util.Scanner;

import products.Books;
import products.DairyProducts;
import products.Fruits;
import products.ProductCategory;
import products.Vegetables;

public class OrganicStore {

    private Scanner sc = new Scanner(System.in);
    private int totalSum = 0;
    private ArrayList<String> billItems = new ArrayList<>();

    public void startShopping() {
        System.out.println("Welcome to Organic Store");
        System.out.println("-----------------------------");
        System.out.println("Available Product Categories:");
        System.out.println("1) Fruits");
        System.out.println("2) Vegetables");
        System.out.println("3) Books");
        System.out.println("4) Dairy Products");
        System.out.println("-----------------------------");
        System.out.println("Please enter your choice (1-4)");

        int choice = sc.nextInt();
        ProductCategory category = null;

        switch (choice) {
            case 1:
                category = new Fruits();
                break;
            case 2:
                category = new Vegetables();
                break;
            case 3:
                category = new Books();
                break;
            case 4:
                category = new DairyProducts();
                break;
            default:
                System.out.println("Invalid Choice");
                startShopping();
                return;
        }

        category.displayProducts();
        totalSum += category.getTotalCost();
        billItems.addAll(category.getPurchasedItems());

        System.out.println("Press 1 to continue shopping or press 2 for bill");
        int nextStep = sc.nextInt();
        if (nextStep == 1) {
            startShopping();
        } else {
            printBill();
        }
    }

    private void printBill() {
        System.out.println("Your Bill:");
        System.out.println("-----------------------------");
        for (String item : billItems) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Amount: ₹" + totalSum);
    }

    public static void main(String[] args) {
        OrganicStore store = new OrganicStore();
        store.startShopping();
    }
}
