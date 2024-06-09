package products;

public class DairyProducts extends ProductCategory {

    private final Product[] dairyProducts = {
        new Product(401, "Milk 1 packet", 30),
        new Product(402, "Curd 1 packet", 30),
        new Product(403, "Butter 1 packet", 50),
        new Product(404, "Cheese 1 packet", 60),
        new Product(405, "Ghee 1 packet", 55)
    };

    @Override
    public void displayProducts() {
        System.out.println("Dairy Products Available:");
        for (Product dairyProduct : dairyProducts) {
            System.out.println(dairyProduct.getCode() + " " + dairyProduct.getName() + " = ₹" + dairyProduct.getPricePerUnit());
        }
        System.out.println("--------------------------");
        System.out.println("Select Product Code");
        int code = sc.nextInt();

        for (Product dairyProduct : dairyProducts) {
            if (dairyProduct.getCode() == code) {
                calculateCost(dairyProduct);
                return;
            }
        }
        System.out.println("Invalid Code");
        displayProducts();
    }
}
