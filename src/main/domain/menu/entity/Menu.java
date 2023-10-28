package main.domain.menu.entity;

import java.util.List;
import java.util.stream.Collectors;
import main.domain.product.entity.Product;

public class Menu {
    private Menu() {
    }

    private Menu(String name, String description, List<Product> products) {
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public static Menu createMenu(String name, String description, List<Product> products) {
        return new Menu(name, description, products);
    }

    private static int id = 1;
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
        /* Product에 toString()이 구현되어있는 경우 */
//         return products.stream()
//                 .map(product -> product.toString())
//                 .collect(Collectors.joining());

        /* Product에 toString()이 "미구현" 되어있는 경우 */
        return products.stream()
                .map(product -> String.format(
                        "Id : %s, Name : %s, Description : %s, Price : %s"
                        , product.getId()
                        , product.getName()
                        , product.getDescription()
                        , product.getPrice()))
                .collect(Collectors.joining());
    }

    public boolean addProduct(Product product) {
        return products.add(product) ? true : false;
    }

    public boolean removeProduct(int id) {
        return products.removeIf(product -> product.getId() == id);
    }

    public static void incrementId() {
        id += 1;
    }
}