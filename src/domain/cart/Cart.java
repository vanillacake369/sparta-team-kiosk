package domain.cart;

import domain.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private int productCount;


    public List<Product> getProducts() {
        return products;
    }

    public int getProductCount() {
        return productCount;
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    //printAllProduct
    @Override
    public String toString() {
        return products.stream()
                .map(product -> product.toString())
                .collect(Collectors.joining());
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Product product : products) {
            totalPrice = product.getPrice() + totalPrice;
        }
        return totalPrice;
    }

    public void clear() {
        productCount = 0;
        products.clear();
    }
}
