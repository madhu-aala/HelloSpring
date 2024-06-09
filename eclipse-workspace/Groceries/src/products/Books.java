package products;

public class Books extends ProductCategory {

    private final Product[] books = {
        new Product(301, "Rich Dad Poor Dad", 149),
        new Product(302, "Atomic Habits", 249),
        new Product(303, "Coffee Can Investing", 99),
        new Product(304, "Intelligent Investor", 199),
        new Product(305, "The Defining Decade", 199)
    };

    @Override
    public void displayProducts() {
        System.out.println("Books Available:");
        for (Product book : books) {
            System.out.println(book.getCode() + " " + book.getName() + " = ₹" + book.getPricePerUnit());
        }
        System.out.println("--------------------------");
        System.out.println("Select Book Code");
        int code = sc.nextInt();

        for (Product book : books) {
            if (book.getCode() == code) {
                calculateCost(book);
                return;
            }
        }
        System.out.println("Invalid Code");
        displayProducts();
    }
}
