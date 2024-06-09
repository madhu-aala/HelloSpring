package products;

public class Fruits extends ProductCategory {

    private final Product[] fruits = {
        new Product(101, "Mangoes 1 kg", 50),
        new Product(102, "Apples 1 kg", 70),
        new Product(103, "Bananas 1 Dozen", 50),
        new Product(104, "Oranges 1 kg", 60),
        new Product(105, "Grapes 1 kg", 55)
    };

    @Override
    public void displayProducts() {
        System.out.println("Fruits Available:");
        for (Product fruit : fruits) {
            System.out.println(fruit.getCode() + " " + fruit.getName() + " = ₹" + fruit.getPricePerUnit());
        }
        System.out.println("--------------------------");
        System.out.println("Select Fruit Code");
        int code = sc.nextInt();

        for (Product fruit : fruits) {
            if (fruit.getCode() == code) {
                calculateCost(fruit);
                return;
            }
        }
        System.out.println("Invalid Code");
        displayProducts();
    }
}
