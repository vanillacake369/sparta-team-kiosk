package domain.product;

public class Product {
    private static int id;
    private String name;
    private String description;
    private double price;

    Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Id : %s | %s | W %s | %s\n", id, this.name, this.price, this.description);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
