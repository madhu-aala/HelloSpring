package products;

public class Product {
    private int code;
    private String name;
    private int pricePerUnit;

    public Product(int code, String name, int pricePerUnit) {
        this.code = code;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }
}
