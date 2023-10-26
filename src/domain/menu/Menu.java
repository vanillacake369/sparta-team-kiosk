package domain.menu;

import domain.menu.product.Product;

import java.util.List;
import java.util.stream.Collectors;

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
                .collect(Collectors.joining(Collectors.joining()));
    }
}