package domain.menu.product;

public class Product {
    private static int id = 1;
    private String name;
    private String description;
    private double price;

    Product(String name, double price, String description) {
        ++id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Id : %s, | %s, | W %s, | %s\n", id, this.name, this.price, this.description);
    }

    public int getId() {
        return ++id;
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
