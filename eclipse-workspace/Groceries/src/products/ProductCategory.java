package products;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class ProductCategory {
    protected Scanner sc = new Scanner(System.in);
    protected int totalCost = 0;
    protected ArrayList<String> purchasedItems = new ArrayList<>();

    public abstract void displayProducts();

    public int getTotalCost() {
        return totalCost;
    }

    public ArrayList<String> getPurchasedItems() {
        return purchasedItems;
    }

    protected void calculateCost(Product product) {
        System.out.println("How many units do you want?");
        int quantity = sc.nextInt();
        int cost = product.getPricePerUnit() * quantity;
        totalCost += cost;
        purchasedItems.add(product.getName() + " x " + quantity + " = ₹" + cost);
        System.out.println("₹" + cost);
    }
}
