package products;

public class Vegetables extends ProductCategory {

    private final Product[] vegetables = {
        new Product(201, "Tomato 1 kg", 50),
        new Product(202, "Potato 1 kg", 70),
        new Product(203, "Brinjal 1 kg", 50),
        new Product(204, "Radish 1 kg", 60),
        new Product(205, "Cucumber 1 kg", 55)
    };

    @Override
    public void displayProducts() {
        System.out.println("Vegetables Available:");
        for (Product vegetable : vegetables) {
            System.out.println(vegetable.getCode() + " " + vegetable.getName() + " = ₹" + vegetable.getPricePerUnit());
        }
        System.out.println("--------------------------");
        System.out.println("Select Vegetable Code");
        int code = sc.nextInt();

        for (Product vegetable : vegetables) {
            if (vegetable.getCode() == code) {
                calculateCost(vegetable);
                return;
            }
        }
        System.out.println("Invalid Code");
        displayProducts();
    }
}
