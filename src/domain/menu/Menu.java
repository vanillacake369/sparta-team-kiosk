package domain.menu;

import domain.menu.product.Product;

import java.util.List;

public class Menu {
    private int id;
    private String name;
    private String description;

    private List<Product> products;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String printAllProducts() {
        return this.products.toString();
    }
}